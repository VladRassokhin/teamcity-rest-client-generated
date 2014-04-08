package org.jetbrains.teamcity.rest.client

import com.google.api.client.http.HttpResponse
import com.google.api.client.http.HttpRequestInitializer
import com.google.api.client.http.HttpRequest
import com.google.api.client.http.HttpExecuteInterceptor
import com.google.api.client.http.HttpUnsuccessfulResponseHandler
import com.google.api.client.http.HttpResponseInterceptor
import com.google.api.client.http.GenericUrl

/**
 * @author Vladislav.Rassokhin
 */

public trait AuthData : HttpRequestInitializer, HttpExecuteInterceptor {
    public fun getUrl(base: String): String
    override fun initialize(request: HttpRequest) {
        request.setInterceptor(this);
    }
    override fun intercept(request: HttpRequest) {
    }
}

public open class AuthDataGuest : AuthData {
    override fun getUrl(base: String): String {
        return base + "/guestAuth"
    }
}
public open class AuthDataBasic(val username: String, val password: String) : AuthData, HttpUnsuccessfulResponseHandler, HttpResponseInterceptor {
    //    val cookies = ArrayList<String>();
    var session: String? = null
    override fun getUrl(base: String): String {
        return base + "/httpAuth"
    }

    override fun intercept(request: HttpRequest) {
        val headers = request.getHeaders();
        if (session == null) {
            headers.setBasicAuthentication(username, password)
        } else {
            headers.setCookie(session);
        }
    }

    override fun initialize(request: HttpRequest) {
        super<AuthData>.initialize(request)
        request.setUnsuccessfulResponseHandler(this)
        request.setResponseInterceptor(this)
    }
    override fun handleResponse(request: HttpRequest, response: HttpResponse, supportsRetry: Boolean): Boolean {
        if (!supportsRetry || response.getStatusCode() != 401) {
            // Nothing to do =(
            return false
        }
        val headers = request.getHeaders()
        if (headers.getAuthorization() == null) {
            // Pass basic authorization
            headers.setBasicAuthentication(username, password);
            return true;
        }
        if (headers.getCookie() != null) {
            //            cookies.clear();
            session = null;
        }
        // Looks like our basic not helped
        return false;
    }
    override fun interceptResponse(response: HttpResponse) {
        when (response.getStatusCode()) {
            401 -> {
                //                cookies.clear()
                session = null;
            }
            else -> {
                // Store cookies
                val headers = response.getHeaders()!!
                val cookie = headers.getHeaderStringValues("Set-Cookie")
                for (c in cookie) {
                    try {
                        val list = java.net.HttpCookie.parse(c)!!
                        for (i in list.filterNotNull()) {
                            if (i.getName()!!.contains("SESSIONID")) {
                                //                                cookies.add(i.toString());
                                session = i.toString();
                            }
                        }
                    } catch(e: Exception) {
                    }
                }
            }
        }
    }
}

public open class ConnectionConfig(url: String, val auth: AuthData) {
    val root: String = if (url.endsWith('/')) url.substring(0, url.length() - 1) else url;

    public fun getRestUrl(): String {
        return auth.getUrl(root)
    }

    public open fun getUrl(path: String): GenericUrl {
        val s = auth.getUrl(root)
        val url = GenericUrl(s)
        if (path.startsWith("/app/rest/")) {
        } else if (path.startsWith("/app")) {
        } else {
            url.appendRawPath("/app/rest")
        }
        url.appendRawPath(path);
        return url
    }
}
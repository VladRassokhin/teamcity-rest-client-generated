package org.jetbrains.teamcity.rest.client

import com.google.api.client.http.HttpHeaders

/**
 * @author Vladislav.Rassokhin
 */


public trait AuthData {
    public fun getUrl(base: String): String
    public fun processHeaders(headers: HttpHeaders)
}

public class AuthDataGuest: AuthData {
    override fun getUrl(base: String): String {
        return base + "/guestAuth/app/rest"
    }
    override fun processHeaders(headers: HttpHeaders) {
    }
}
public class AuthDataBasic(val username: String, val password: String): AuthData {
    override fun getUrl(base: String): String {
        return base + "/httpAuth/app/rest"
    }
    override fun processHeaders(headers: HttpHeaders) {
        headers.setBasicAuthentication(username, password)
    }
}

public class ConnectionConfig(url: String, val auth: AuthData) {
    val url: String = if (url.endsWith('/')) url.substring(0, url.length() - 1) else url;

    public fun getRestUrl(): String {
        return auth.getUrl(url)
    }

    public fun processHeaders(headers: HttpHeaders) {
        return auth.processHeaders(headers);
    }
}
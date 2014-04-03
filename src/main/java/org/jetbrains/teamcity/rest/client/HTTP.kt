package org.jetbrains.teamcity.rest.client

import com.google.api.client.http.GenericUrl
import com.google.api.client.http.HttpContent
import com.google.api.client.http.HttpHeaders
import com.google.api.client.http.HttpRequestFactory
import com.google.api.client.http.HttpResponse
import com.google.api.client.http.javanet.NetHttpTransport
import com.google.api.client.json.GenericJson
import com.google.api.client.json.Json
import com.google.api.client.json.JsonObjectParser
import com.google.api.client.json.jackson2.JacksonFactory
import com.google.api.client.util.ObjectParser
import java.util.Collections
import kotlin.test.assertNotNull
import org.jetbrains.teamcity.rest.client.RequestsProcessor.Method

class HTTP(val root: GenericUrl) : RequestsProcessor {

    class object {
        private val factory: HttpRequestFactory = NetHttpTransport().createRequestFactory()!!
        private val parser = JsonObjectParser(JacksonFactory())
    }

    fun url(path: String): GenericUrl {
        val url = root.clone()!!
        url.appendRawPath(path);
        return url;
    }

    override fun request(path: String, method: Method, content: HttpContent?, headers: Map<String, String>?, parser: ObjectParser?): HttpResponse {

        if ( method == Method.POST ) {
            assertNotNull(content, "POST request requires content")
        }

        val url = url(path)
        val request = when (method) {
            Method.HEAD -> factory.buildHeadRequest(url)
            Method.GET -> factory.buildGetRequest (url)
            Method.POST -> factory.buildPostRequest(url, content!!)
            else -> throw IllegalStateException("Unsuppored type ${method}")
        }

        if ( headers != null ) {
            val httpHeaders = HttpHeaders()
            for ( (k, v) in headers.entrySet() ) {
                httpHeaders.set(k, v)
            }
            request.setHeaders(httpHeaders)
        }

        request.setParser(parser)

        val response = request.setThrowExceptionOnExecuteError(false).execute()!!

        return response
    }


    override fun head (url: String): HttpResponse = request(url, Method.HEAD)

    override fun get (url: String): HttpResponse = request(url, Method.GET)

    override fun post (url: String, content: HttpContent): HttpResponse = request(url, Method.POST, content)

    override fun status (url: String): Int = head(url).getStatusCode()

    override fun getAsString (url: String): String = get(url).parseAsString()!!

    override fun getAsJson (url: String): GenericJson = getAs(url, javaClass<GenericJson>())

    override fun getAs<T> (url: String, rtype: Class<T>): T {
        val response = request(method = Method.GET, path = url, headers = Collections.singletonMap("Accept", Json.MEDIA_TYPE), parser = parser)
        return response.parseAs(rtype)!!
    }
}

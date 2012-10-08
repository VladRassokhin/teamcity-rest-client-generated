package org.jetbrains.teamcity.rest.client.util

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
import org.jetbrains.teamcity.mylyn.core.client.RequestsProcessor
import org.jetbrains.teamcity.mylyn.core.client.RequestsProcessor.RequestType

class HTTP: RequestsProcessor {

    class object {
        private val factory: HttpRequestFactory = NetHttpTransport().createRequestFactory()!!
        private val jsonParser = JsonObjectParser(JacksonFactory())
    }

    override fun request(url: String, rtype: RequestType, content: HttpContent?, headers: Map<String, String>?, parser: ObjectParser?): HttpResponse {

        if ( rtype == RequestType.POST ){
            assertNotNull(content, "POST request requires content")
        }

        val genericUrl = GenericUrl(url)
        val request = when (rtype) {
            RequestType.HEAD -> factory.buildHeadRequest(genericUrl)!!
            RequestType.GET -> factory.buildGetRequest (genericUrl)!!
            RequestType.POST -> factory.buildPostRequest(genericUrl, content!!)!!
            else -> throw IllegalStateException("Unsuppored type ${rtype}")
        }

        if ( headers != null ) {
            val httpHeaders = HttpHeaders()
            for ( (k, v) in headers.entrySet() ){
                httpHeaders.set(k, v)
            }
            request.setHeaders(httpHeaders)
        }

        request.setParser(parser)

        val response = request.setThrowExceptionOnExecuteError(false)!!.execute()!!

        return response
    }


    override fun head (url: String): HttpResponse = request(url, RequestType.HEAD)

    override fun get (url: String): HttpResponse = request(url, RequestType.GET)

    override fun post (url: String, content: HttpContent): HttpResponse = request(url, RequestType.POST, content)

    override fun status (url: String): Int = head(url).getStatusCode()

    override fun getAsString (url: String): String = get(url).parseAsString()!!

    override fun getAsJson (url: String): GenericJson = getAs(url, javaClass<GenericJson>())

    override fun getAs<T> (url: String, rtype: Class<T>): T {
        val response = request(rtype = RequestType.GET, url = url, headers = Collections.singletonMap("Accept", Json.MEDIA_TYPE), parser = jsonParser)
        return response.parseAs(rtype)!!
    }
}

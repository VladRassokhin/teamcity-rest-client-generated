package org.jetbrains.teamcity.rest.client

import com.google.api.client.http.HttpContent
import com.google.api.client.http.HttpResponse
import com.google.api.client.json.GenericJson
import com.google.api.client.util.ObjectParser
import com.google.api.client.http.json.JsonHttpContent

/**
 * @author Vladislav.Rassokhin
 */
public trait RequestsProcessor {
    enum class Method {
        CONNECT
        DELETE
        GET
        HEAD
        OPTIONS
        PATCH
        POST
        PUT
        TRACE
    }

    /**
     * General request invoked - invokes an HTTP request and returns the corresponding response.
     */
    fun request(path: String, method: Method, content: HttpContent? = null, headers: Map<String, String>? = null, parser: ObjectParser? = null): HttpResponse

    /**
     * Sends a HEAD request and returns a corresponding [[HttpResponse]].
     */
    fun head (url: String): HttpResponse

    /**
     * Sends a GET request and returns a corresponding [[HttpResponse]].
     */
    fun get (url: String): HttpResponse

    /**
     * Sends a POST request and returns a corresponding [[HttpResponse]].
     */
    fun post (url: String, content: HttpContent): HttpResponse

    /**
     * Retrieves a status code of sending a HEAD request. See [[HttpStatusCodes]]
     */
    fun status (url: String): Int

    /**
     * Retrieves [[String]] response of sending a GET request.
     */
    fun getAsString (url: String): String

    /**
     * Retrieves [[GenericJson]] response of sending a GET request.
     */
    fun getAsJson (url: String): GenericJson

    /**
     * Retrieves [[T]] response of sending a GET request.
     */
    fun getAs<T> (url: String, rtype: Class<T>): T

    /**
     * Retrieves [[T]] response of sending a GET request. No exception on parse error
     */
    fun getSafeAs<T> (url: String, rtype: Class<T>): Triple<T?, Exception?, HttpResponse>

    fun asJson (data: Any): JsonHttpContent
}
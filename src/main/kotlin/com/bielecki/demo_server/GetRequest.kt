package com.bielecki.demo_server

import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL

/**
 * robi GET na wskazny adres
 */
class GetRequest {

fun myrequest(){
    val urlForGetRequest = URL("http://localhost:8080/greeting")

    var readLine: String? = null

    val conection: HttpURLConnection = urlForGetRequest.openConnection() as HttpURLConnection

    conection.requestMethod = "GET"

    conection.setRequestProperty("userId", "a1bcdef") // set userId its a sample here


    val responseCode: Int = conection.responseCode

    if (responseCode == HttpURLConnection.HTTP_OK) {
        val `in` = BufferedReader(
                InputStreamReader(conection.inputStream))
        val response = StringBuffer()
        while (`in`.readLine().also { readLine = it } != null) {
            response.append(readLine)
        }
        `in`.close()

        // print result
        println("JSON String Result $response")

        //GetAndPost.POSTRequest(response.toString());
    } else {
        println("GET NOT WORKED")
    }
}
}
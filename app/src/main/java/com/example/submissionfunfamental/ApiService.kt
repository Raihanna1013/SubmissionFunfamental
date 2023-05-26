package com.example.submissionfunfamental
import android.telecom.Call
import okhttp3.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    @GET("detail/{name}")
    fun getUser(
        @Path("name") id: String
    )

}
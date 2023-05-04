package com.intelligentbackpack.accessdata.api

import io.github.andreabrighi.converter.RetrofitJsonConverterFactory
import okhttp3.OkHttpClient
import retrofit2.Retrofit

object RetrofitHelper {
    fun getInstance(baseUrl: String): Retrofit {
        val httpClient = OkHttpClient.Builder()
        return Retrofit
            .Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(RetrofitJsonConverterFactory.create())
            .client(httpClient.build())
            .build()
    }
}
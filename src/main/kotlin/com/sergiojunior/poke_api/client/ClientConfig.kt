package com.sergiojunior.poke_api.client

import okhttp3.HttpUrl
import okhttp3.HttpUrl.Companion.toHttpUrlOrNull
import okhttp3.OkHttpClient
import java.util.concurrent.TimeUnit

class ClientConfig(
    val rootUrl: HttpUrl = "https://pokeapi.co/api/v2/".toHttpUrlOrNull()!!,
    val okHttpConfig: OkHttpClient.Builder.() -> OkHttpClient.Builder = {
        retryOnConnectionFailure(false)
        connectTimeout(30,TimeUnit.SECONDS)
        readTimeout(30,TimeUnit.SECONDS)
        writeTimeout(30,TimeUnit.SECONDS)
    }
)

package com.sergiojunior.poke_api.client

import PokeApiService
import com.google.gson.FieldNamingPolicy
import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken
import com.sergiojunior.poke_api.model.ApiResource
import com.sergiojunior.poke_api.model.NamedApiResource
import com.sergiojunior.poke_api.utils.ApiResourceAdapter
import com.sergiojunior.poke_api.utils.NamedApiResourceAdapter
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class PokeApiServiceImpl(private val config:ClientConfig): PokeApiService by Retrofit.Builder().baseUrl(config.rootUrl).addConverterFactory(
    GsonConverterFactory.create(
        GsonBuilder().apply {
            setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
            registerTypeAdapter(TypeToken.get(ApiResource::class.java).type,ApiResourceAdapter())
            registerTypeAdapter(TypeToken.get(NamedApiResource::class.java).type, NamedApiResourceAdapter())
        }.create()
    )
).client(OkHttpClient.Builder().(config.okHttpConfig)().build()).build().create(PokeApiService::class.java)
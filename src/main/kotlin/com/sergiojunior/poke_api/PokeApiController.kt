package com.sergiojunior.poke_api

import com.sergiojunior.poke_api.model.ResourceSummaryList
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import okhttp3.OkHttpClient
import okhttp3.Request
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api/v1")
class PokeApiController(){
    @GetMapping("/pokemons")
    fun getPokemons(): Any? {
        val client = OkHttpClient()
        val moshi = Moshi.Builder()
            .add(KotlinJsonAdapterFactory())
            .build()

        val request =
            Request.Builder().url("https://pokeapi.co/api/v2/pokemon?limit=100000&offset=0").build()

        val response = client.newCall(request).execute()
        if (response.isSuccessful) {
            val responseBody = response.body?.string()
            if (responseBody != null) {

                val pokemons = moshi.adapter(ResourceSummaryList::class.java).fromJson(responseBody)
                if (pokemons != null) {
                    return pokemons.results
                }
            }
        } else {
            return "Erro ao obter dados do Pokémon"
        }
        return response.body?.toString()
    }
}
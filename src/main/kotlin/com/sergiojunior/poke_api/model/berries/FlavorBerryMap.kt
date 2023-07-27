package com.sergiojunior.poke_api.model.berries

import com.sergiojunior.poke_api.model.NamedApiResource


data class FlavorBerryMap(
    val potency: Int,
    val berry: NamedApiResource
)
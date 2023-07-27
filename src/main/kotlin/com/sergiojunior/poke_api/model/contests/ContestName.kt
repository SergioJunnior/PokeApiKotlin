package com.sergiojunior.poke_api.model.contests

import com.sergiojunior.poke_api.model.NamedApiResource

data class ContestName(
    val name: String,
    val color: String,
    val language: NamedApiResource
)


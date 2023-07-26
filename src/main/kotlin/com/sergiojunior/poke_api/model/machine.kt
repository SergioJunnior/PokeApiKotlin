package com.sergiojunior.poke_api.model

data class Machine (
    val id:Int,
    val item: NamedApiResource,
    val move: NamedApiResource,
    val versionGroup: NamedApiResource,
)
package com.sergiojunior.poke_api.model.contests

import com.sergiojunior.poke_api.model.NamedApiResource

data class ContestType(
    val id: Int,
    val name: String,
    val berryFlavor: NamedApiResource,
    val names: List<ContestName>
)

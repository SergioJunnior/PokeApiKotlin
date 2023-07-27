package com.sergiojunior.poke_api.model.berries

import com.sergiojunior.poke_api.model.Name
import com.sergiojunior.poke_api.model.NamedApiResource

data class BerryFlavor(
    val id: Int,
    val name: String,
    val berries: List<FlavorBerryMap>,
    val contestType: NamedApiResource,
    val names: List<Name>
)


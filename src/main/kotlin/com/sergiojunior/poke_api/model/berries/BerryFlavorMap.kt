package com.sergiojunior.poke_api.model.berries

import com.sergiojunior.poke_api.model.NamedApiResource

data class BerryFlavorMap(
    val potency: Int,
    val flavor: NamedApiResource
)

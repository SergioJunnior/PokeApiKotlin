package com.sergiojunior.poke_api.model.berries

import com.sergiojunior.poke_api.model.Name
import com.sergiojunior.poke_api.model.NamedApiResource

data class BerryFirmness(
    val id: Int,
    val name: String,
    val berries: List<NamedApiResource>,
    val names: List<Name>
)

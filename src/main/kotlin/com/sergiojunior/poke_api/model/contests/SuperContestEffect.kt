package com.sergiojunior.poke_api.model.contests

import com.sergiojunior.poke_api.model.FlavorText
import com.sergiojunior.poke_api.model.NamedApiResource

data class SuperContestEffect(
    val id: Int,
    val appeal: Int,
    val flavorTextEntries: List<FlavorText>,
    val moves: List<NamedApiResource>
)

package com.sergiojunior.poke_api.model.contests

import com.sergiojunior.poke_api.model.Effect
import com.sergiojunior.poke_api.model.FlavorText

data class ContestEffect(
    val id: Int,
    val appeal: Int,
    val jam: Int,
    val effectEntries: List<Effect>,
    val flavorTextEntries: List<FlavorText>
)

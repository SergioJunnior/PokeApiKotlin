package com.sergiojunior.poke_api.model.berries

import com.sergiojunior.poke_api.model.NamedApiResource

data class Berry(
    val id: Int,
    val name: String,
    val growthTime: Int,
    val maxHarvest: Int,
    val naturalGiftPower: Int,
    val size: Int,
    val smoothness: Int,
    val soilDryness: Int,
    val firmness: NamedApiResource,
    val flavors: List<BerryFlavorMap>,
    val item: NamedApiResource,
    val naturalGiftType: NamedApiResource
)

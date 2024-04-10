package com.gogolook.richman.space

import com.gogolook.richman.player.Player

sealed class Space(val name: String) {

    object Start : Space("Start")

    object Chance : Space("Chance")

    object Jail : Space("Jail")

    object Park : Space("Park")

    class Land(
        name: String,
        val price: Int,
        val owner: Player? = null,
        var state: LandState = LandState.Vacant,
    ) : Space(name)

}
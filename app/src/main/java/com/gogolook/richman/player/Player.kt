package com.gogolook.richman.player

import com.gogolook.richman.space.Space
import com.gogolook.richman.dice.Dice

data class Player(
    val id: Int,
    val name: String,

    var money: Int,
    val lands: MutableList<Space.Land> = mutableListOf(),

    var position: Int,

    val bornDice: Dice,
    val extraDiceList: MutableList<Dice> = mutableListOf(),
)
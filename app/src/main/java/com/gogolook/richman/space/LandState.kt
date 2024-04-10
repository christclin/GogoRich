package com.gogolook.richman.space

enum class LandState(val price: Int) {
    Vacant(0),
    Bungalow(200),
    Villa(500),
    Hotel(1000);

    private val entries = LandState.values()

    operator fun plus(level: Int): LandState {
        val index = (ordinal + level).coerceAtMost(entries.lastIndex)
        return entries[index]
    }

    operator fun minus(level: Int): LandState {
        val index = (ordinal - level).coerceAtLeast(0)
        return entries[index]
    }
}
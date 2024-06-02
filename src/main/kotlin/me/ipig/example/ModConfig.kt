package me.ipig.example

import cc.polyfrost.oneconfig.config.Config
import cc.polyfrost.oneconfig.config.data.Mod
import cc.polyfrost.oneconfig.config.data.ModType

object ModConfig : Config(Mod(ExampleMod.NAME, ModType.UTIL_QOL), "${ExampleMod.MODID}.json") {
    init {
        initialize()
    }
}
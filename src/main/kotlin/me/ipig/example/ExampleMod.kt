package me.ipig.example

import cc.polyfrost.oneconfig.utils.commands.CommandManager
import me.ipig.example.ExampleMod
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.event.FMLInitializationEvent

/**
 * The entrypoint of the Example Mod that initializes it.
 *
 * @see Mod
 *
 * @see InitializationEvent
 */
@Mod(modid = ExampleMod.MODID,
    name = ExampleMod.NAME,
    version = ExampleMod.VERSION,
    modLanguageAdapter = "cc.polyfrost.oneconfig.utils.KotlinLanguageAdaptercc.polyfrost.oneconfig.utils.KotlinLanguageAdapter"
)
object ExampleMod {
    const val MODID: String = "@ID@"
    const val NAME: String = "@NAME@"
    const val VERSION: String = "@VER@"
    @Mod.EventHandler
    fun onInit(event: FMLInitializationEvent) {
        ModConfig
    }




}

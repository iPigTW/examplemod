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
@Mod(modid = ExampleMod.MODID, name = ExampleMod.NAME, version = ExampleMod.VERSION)
class ExampleMod {
    // Register the config and commands.
    @Mod.EventHandler
    fun onInit(event: FMLInitializationEvent?) {
        config = TestConfig()
        CommandManager.INSTANCE.registerCommand(ExampleCommand())
    }

    companion object {
        const val MODID: String = "@ID@"
        const val NAME: String = "@NAME@"
        const val VERSION: String = "@VER@"

        // Sets the variables from `gradle.properties`. See the `blossom` config in `build.gradle.kts`.
        @Mod.Instance(MODID)
        var INSTANCE: ExampleMod? = null // Adds the instance of the mod, so we can access other variables.
        var config: TestConfig? = null
    }
}

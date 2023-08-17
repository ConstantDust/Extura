package org.figuramc.extura.forge;

import net.minecraftforge.fml.common.Mod;
import org.figuramc.extura.ExamplePlugin;

/**
 * A mod class is needed for Forge to load the Plugin
 */
@Mod(ExamplePlugin.PLUGIN_ID)
public class ExampleModForge {
    public ExampleModForge() {
        ExamplePlugin.init();
    }
}

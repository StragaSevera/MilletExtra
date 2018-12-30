package ru.ought.milletextra;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraft.item.Item;
import ru.ought.milletextra.items.ItemKey;

@SuppressWarnings("WeakerAccess")
@Mod(modid = MilletExtra.MODID, version = MilletExtra.VERSION)
public class MilletExtra {
    public static final String MODID = "milletextra";
    public static final String VERSION = "1.0";

    public static String makeName(String name) {
        return MODID + "_" + name;
    }

    public static Item key;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        key = new ItemKey();
        GameRegistry.registerItem(key, "key");
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        // some example code
        System.out.println("DIRT BLOCK >> " + Blocks.dirt.getUnlocalizedName());
    }
}

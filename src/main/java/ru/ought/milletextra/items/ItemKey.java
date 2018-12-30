package ru.ought.milletextra.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import ru.ought.milletextra.MilletExtra;

public class ItemKey extends Item {
    public ItemKey() {
        setUnlocalizedName(MilletExtra.makeName("key"));
        setTextureName(MilletExtra.makeTextureName("key"));
        setCreativeTab(CreativeTabs.tabMisc);
    }
}

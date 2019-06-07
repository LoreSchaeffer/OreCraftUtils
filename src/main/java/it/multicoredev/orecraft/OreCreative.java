package it.multicoredev.orecraft;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class OreCreative extends CreativeTabs {

    public OreCreative() {
        super(OreCraft.MODID);
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModItems.euro1);
    }
}

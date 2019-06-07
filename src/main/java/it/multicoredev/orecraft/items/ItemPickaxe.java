package it.multicoredev.orecraft.items;

import it.multicoredev.orecraft.OreCraft;
import net.minecraft.creativetab.CreativeTabs;

public class ItemPickaxe extends net.minecraft.item.ItemPickaxe {
    private String name;

    public ItemPickaxe(ToolMaterial material, String name) {
        super(material);
        this.name = name;
        setUnlocalizedName(OreCraft.MODID + "." + name);
        setRegistryName(name);
    }

    public void registerItemModel() {
        OreCraft.proxy.registerItemRenderer(this, 0, name);
    }

    @Override
    public ItemPickaxe setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }
}

package it.multicoredev.orecraft.items;

import it.multicoredev.orecraft.OreCraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemAxe extends net.minecraft.item.ItemAxe {
    private String name;

    public ItemAxe(Item.ToolMaterial material, String name) {
        super(material, 8f, -3.1f);
        this.name = name;
        setUnlocalizedName(OreCraft.MODID + "." + name);
        setRegistryName(name);
    }

    public void registerItemModel() {
        OreCraft.proxy.registerItemRenderer(this, 0, name);
    }

    @Override
    public ItemAxe setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }
}

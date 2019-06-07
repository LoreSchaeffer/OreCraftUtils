package it.multicoredev.orecraft.items;

import it.multicoredev.orecraft.OreCraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemHoe extends net.minecraft.item.ItemHoe {
    private String name;

    public ItemHoe(Item.ToolMaterial material, String name) {
        super(material);
        this.name = name;
        setUnlocalizedName(OreCraft.MODID + "." + name);
        setRegistryName(name);
    }

    public void registerItemModel() {
        OreCraft.proxy.registerItemRenderer(this, 0, name);
    }

    @Override
    public ItemHoe setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }
}

package it.multicoredev.orecraft.items;

import it.multicoredev.orecraft.OreCraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;

public class ItemArmor extends net.minecraft.item.ItemArmor {
    private String name;

    public ItemArmor(ArmorMaterial material, EntityEquipmentSlot slot, String name) {
        super(material, 0, slot);
        this.name = name;
        setUnlocalizedName(OreCraft.MODID + "." + name);
        setRegistryName(name);
    }

    public void registerItemModel() {
        OreCraft.proxy.registerItemRenderer(this, 0, name);
    }

    @Override
    public ItemArmor setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }
}

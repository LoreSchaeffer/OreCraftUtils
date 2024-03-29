package it.multicoredev.orecraft.items;

import net.minecraft.item.ItemStack;

public class ItemFuel extends ItemBase {
    private int burnTime;

    public ItemFuel(String name, int burnTime) {
        super(name);
        this.burnTime = burnTime;
    }

    @Override
    public int getItemBurnTime(ItemStack itemStack) {
        return burnTime;
    }
}

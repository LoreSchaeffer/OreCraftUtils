package it.multicoredev.orecraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

import java.util.Objects;

public class CharcoalBlock extends BlockBase {
    private int burnTime;

    public CharcoalBlock(Material material, String name, int burnTime) {
        super(material, name);
        setHarvestLevel("pickaxe", 0);
        setHardness(5);
        setResistance(20);
        setSoundType(SoundType.STONE);

        this.burnTime = burnTime;
    }

    @Override
    public Item createItemBlock() {
        return new CharcoalItem(this).setRegistryName(Objects.requireNonNull(getRegistryName()));
    }

    private class CharcoalItem extends ItemBlock {

        public CharcoalItem(Block block) {
            super(block);
        }

        @Override
        public int getItemBurnTime(ItemStack itemStack) {
            return burnTime;
        }
    }
}

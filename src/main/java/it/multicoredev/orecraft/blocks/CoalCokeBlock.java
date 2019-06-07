package it.multicoredev.orecraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

import java.util.Objects;

public class CoalCokeBlock extends BlockBase {
    private int burnTime;

    public CoalCokeBlock(Material material, String name, int burnTime) {
        super(material, name);
        setHarvestLevel("pickaxe", 0);
        setHardness(5);
        setResistance(30);
        setSoundType(SoundType.STONE);

        this.burnTime = burnTime;
    }

    @Override
    public Item createItemBlock() {
        return new CoalCokeItem(this).setRegistryName(Objects.requireNonNull(getRegistryName()));
    }

    private class CoalCokeItem extends ItemBlock {

        public CoalCokeItem(Block block) {
            super(block);
        }

        @Override
        public int getItemBurnTime(ItemStack itemStack) {
            return burnTime;
        }
    }
}

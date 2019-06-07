package it.multicoredev.orecraft.items;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import it.multicoredev.orecraft.OreCraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

import java.util.Set;

public class ItemPaxel extends ItemPickaxe {
    private String name;
    private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(
            Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN, Blocks.MELON_BLOCK, Blocks.LADDER, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE,
            Blocks.CLAY, Blocks.DIRT, Blocks.FARMLAND, Blocks.GRASS, Blocks.GRAVEL, Blocks.MYCELIUM, Blocks.SAND, Blocks.SNOW, Blocks.SNOW_LAYER, Blocks.SOUL_SAND, Blocks.GRASS_PATH, Blocks.CONCRETE_POWDER
    );

    public ItemPaxel(ToolMaterial material, String name) {
        super(material);
        this.name = name;
        setUnlocalizedName(OreCraft.MODID + "." + name);
        setRegistryName(name);
    }

    public void registerItemModel() {
        OreCraft.proxy.registerItemRenderer(this, 0, name);
    }

    @Override
    public ItemPaxel setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }

    @Override
    public Set<String> getToolClasses(ItemStack item) {
        return ImmutableSet.of("pickaxe", "axe", "spade", "hoe", "sword");
    }

    @Override
    public boolean canHarvestBlock(IBlockState block) {
        return EFFECTIVE_ON.contains(block.getBlock()) || super.canHarvestBlock(block);
    }

    @Override
    public float getDestroySpeed(ItemStack item, IBlockState block) {
        Material material = block.getMaterial();

        if(material == Material.WOOD && material == Material.PLANTS && material == Material.VINE) {
            return this.efficiency;
        }

        return EFFECTIVE_ON.contains(block.getBlock()) ? this.efficiency : super.getDestroySpeed(item, block);
    }
}

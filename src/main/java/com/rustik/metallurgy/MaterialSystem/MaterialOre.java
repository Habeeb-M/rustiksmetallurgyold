package com.rustik.metallurgy.MaterialSystem;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.HashSet;
import java.util.Set;

import static com.rustik.metallurgy.utils.MetallurgyObjects.materialOre;

public class MaterialOre extends Block{

    public static Set<Block> ores = new HashSet<> ();
    public int oreAmount = 0;

    public MaterialOre(Material blockMaterialIn, MapColor blockMapColorIn, int oreAmount) {
        super(blockMaterialIn, blockMapColorIn);
        this.oreAmount = oreAmount;
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation( Item.getItemFromBlock(materialOre), 0, new ModelResourceLocation (getRegistryName(), "inventory"));
    }
}

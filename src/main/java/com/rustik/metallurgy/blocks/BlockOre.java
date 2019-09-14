package com.rustik.metallurgy.blocks;

import com.rustik.metallurgy.metallurgy;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockOre extends Block {
    public BlockOre () {
        super( Material.ROCK);
        setHardness ( 2F );
        setTranslationKey( metallurgy.MODID + ".BlockOre");
        setRegistryName(metallurgy.MODID, "blockore");
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation( Item.getItemFromBlock(this), 0, new ModelResourceLocation (getRegistryName(), "inventory"));
    }
}
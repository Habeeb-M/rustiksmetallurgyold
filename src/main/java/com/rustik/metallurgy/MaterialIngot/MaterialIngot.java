package com.rustik.metallurgy.MaterialIngot;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.HashSet;
import java.util.Set;

import static net.minecraftforge.client.model.ModelLoader.setCustomModelResourceLocation;

public class MaterialIngot extends Item {

    public static Set<Item> ingots = new HashSet<> ();

    public int i = 1;
    public MaterialIngot (int i) {
        this.i = i;
    }

    @SideOnly(Side.CLIENT)
    public void initModel () {
        setCustomModelResourceLocation(this, 0, new ModelResourceLocation ("metallurgy:models/item/materialingot", "inventory"));
    }

    @GameRegistry.ObjectHolder("metallurgy:materialingot")
    public static MaterialIngot materialIngot;


}
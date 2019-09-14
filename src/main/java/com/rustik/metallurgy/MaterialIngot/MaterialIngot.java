package com.rustik.metallurgy.MaterialIngot;

import com.rustik.metallurgy.metallurgy;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.HashSet;
import java.util.Set;

public class MaterialIngot extends Item {

    public static Set<Item> ingots = new HashSet<> ();

    public int i = 0;
    public MaterialIngot (int i) {
        this.i = i;
    }

    public MaterialIngot() {
        setTranslationKey ( metallurgy.MODID + ".materialIngot" + i);
    }

    @SideOnly(Side.CLIENT)
    public void initModel () {
        ModelLoader.setCustomModelResourceLocation ( this , 0 , new ModelResourceLocation ( getRegistryName () , "inventory" ) );
    }

    @GameRegistry.ObjectHolder("metallurgy:materialingot")
    public static MaterialIngot materialIngot;


}
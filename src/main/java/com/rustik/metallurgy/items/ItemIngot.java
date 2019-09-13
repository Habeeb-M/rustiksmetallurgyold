package com.rustik.metallurgy.items;

import com.rustik.metallurgy.metallurgy;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemIngot extends Item {
    public ItemIngot () {
        setRegistryName ( metallurgy.MODID, "itemIngot");
        setTranslationKey ( metallurgy.MODID + ".itemIngot" );
    }
    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation (getRegistryName(), "inventory"));
    }
}

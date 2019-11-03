package com.rustik.metallurgy.MaterialSystem;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.client.renderer.color.ItemColors;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.HashSet;
import java.util.Set;

import static net.minecraftforge.client.model.ModelLoader.setCustomModelResourceLocation;

public class MaterialOreCrushed extends Item {

    public static Set<Item> orecrushed = new HashSet<>();

    public int orecrushedamount = 0;

    public MaterialOreCrushed (int orecrushedamount) {
        this.orecrushedamount = orecrushedamount;
    }

    @SideOnly(Side.CLIENT)
    public void initModel ( ) {
        setCustomModelResourceLocation ( this , 0 , new ModelResourceLocation( "metallurgy:materialorecrushed" , "inventory" ) );
    }


    @GameRegistry.ObjectHolder("metallurgy:materialorecrushed")
    public static MaterialOreCrushed materialOreCrushed;

    public static void registerColors ( ) {
        ItemColors ic = Minecraft.getMinecraft ().getItemColors ();
        ic.registerItemColorHandler (
                new IItemColor() {
                    @Override
                    public int colorMultiplier (ItemStack stack , int tintIndex) {
                        if ( stack != ItemStack.EMPTY ) {
                            switch (((MaterialOreCrushed) stack.getItem()).orecrushedamount) {
                                case 0:	return  0xcafbf6;
                            }
                        }
                        return 0xffffff;
                    }
                } ,
                orecrushed.toArray ( new Item[0] ) );
    }
}
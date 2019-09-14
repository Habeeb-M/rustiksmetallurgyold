package com.rustik.metallurgy.proxy;

import com.rustik.metallurgy.blocks.ModBlocks;
import com.rustik.metallurgy.items.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.client.renderer.color.ItemColors;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

import static com.rustik.metallurgy.MaterialIngot.MaterialIngot.ingots;

@Mod.EventBusSubscriber(Side.CLIENT)
public class ClientProxy extends CommonProxy {
    @Override
    public void preInit (FMLPreInitializationEvent e) {
        super.preInit ( e );
    }

    @SubscribeEvent
    public static void registerModels (ModelRegistryEvent event) {
        ModItems.initModels ();
        ModelLoader.setCustomModelResourceLocation ( Item.getItemFromBlock ( ModBlocks.blockOre ) , 0 , new ModelResourceLocation ( ModBlocks.itemBlockOre.getRegistryName () , "inventory" ) );
    }

    ItemColors ic = Minecraft.getMinecraft ().getItemColors ();


    public void registerColors ( ) {
        ItemColors ic = Minecraft.getMinecraft ().getItemColors ();
        ic.registerItemColorHandler (
                new IItemColor () {
                    @Override
                    public int colorMultiplier (ItemStack stack , int tintIndex) {
                        if ( stack != ItemStack.EMPTY ) {
                            switch (stack.getMetadata ()) {
                                case 0:
                                    return 0xa24203;
                                case 1:
                                    return 0x3333FF;
                                case 2:
                                    return 0x71544f;

                            }
                        }
                        return 0xffffff;
                    }
                } ,
                ingots.toArray ( new Item[0] ) );
    }
}

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
                            switch (stack.getItem (i)) {
                                case 0:	return 0xcafbf6;
                                case 1:	return 0xf4f4f4;
                                case 2:	return 0xf5f7c5;
                                case 3:	return 0xa5a5a5;
                                case 4:	return 0xe0a532;
                                case 5:	return 0x274828;
                                case 6:	return 0x323232;
                                case 7:	return 0x5d5d5d;
                                case 8:	return 0x343434;
                                case 9:	return 0xe2dfb7;
                                case 10: return	0x383838;
                                case 11: return	0x9e9e9e;
                                case 12: return	0x545454;
                                case 13: return	0x7b7b7b;
                                case 14: return	0x0d0d0d;
                                case 15: return	0x9a998c;
                                case 16: return	0xf5e922;
                                case 17: return	0xc3c3c3;
                                case 18: return	0xc5caff;
                                case 19: return	0xf6733a;
                                case 20: return	0x8d8a79;
                                case 21: return	0xdcfef8;
                                case 22: return	0xf8f8f8;
                                case 23: return	0xc2fff5;
                                case 24: return	0xececec;
                                case 25: return	0xa1a1a1;
                                case 26: return	0xbd6554;
                                case 27: return	0x96bd94;
                                case 28: return	0xd5d5d5;
                                case 29: return	0x2c2c2c;
                                case 30: return	0xffea76;
                                case 31: return	0xb4b4b4;
                                case 32: return	0x2e2e2e;
                                case 33: return	0xa7b3a8;
                                case 34: return	0xececec;
                                case 35: return	0x6d6d6d;
                                case 36: return	0xc3c3c3;
                                case 37: return	0xbeafae;
                                case 38: return	0x8d8d8d;
                                case 39: return	0x635c7a;
                                case 40: return	0x646464;
                                case 41: return	0x848484;
                                case 42: return	0xd8d0f2;
                                case 43: return	0xb0daf0;
                                case 44: return	0xd2d2d2;
                                case 45: return	0xfff8dc;
                                case 46: return	0x5c7468;
                                case 47: return	0xa4a4a4;
                                case 48: return	0xeae6be;
                                case 49: return	0xd5f6f5;
                                case 50: return	0xf6f4cb;
                                case 51: return	0xc8aba1;
                                case 52: return	0xf5f5f5;
                                case 53: return	0xe8e8e8;
                                case 54: return	0xd6eccc;
                                case 55: return	0xcdeef0;
                                case 56: return	0xddddd5;
                                case 57: return	0x64ffb4;
                                case 58: return	0x4b9d3d;
                                case 59: return	0x74eb61;
                                case 60: return	0x505050;
                                case 61: return	0xcbcbcb;
                                case 62: return	0x939393;
                                case 63: return	0x747474;
                                case 64: return	0xbec49a;
                                case 65: return	0xccd0b4;
                                case 66: return	0x252525;
                                case 67: return	0x121212;
                                case 68: return	0xeeeeee;
                                case 69: return	0xeeeeee;
                                case 70: return	0xd9e279;
                                case 71: return	0xfcff00;
                                case 72: return	0xcecece;
                                case 73: return	0x7b7b7b;
                                case 74: return	0x515150;
                                case 75: return	0x737373;
                                case 76: return	0x565656;
                                case 77: return	0x5b4f4e;
                                case 78: return	0x707070;
                                case 79: return	0xe9e9e9;
                                case 80: return	0xc6c6c6;
                                case 81: return	0x757575;
                                case 82: return	0xe4e589;
                                case 83: return	0xdbdbdb;
                                case 84: return	0xcbcbcb;
                                case 85: return	0x838383;
                                case 86: return	0xe6e6e6;
                            }
                        }
                        return 0xffffff;
                    }
                } ,
                ingots.toArray ( new Item[0] ) );
    }
}

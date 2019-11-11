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

public class MaterialIngot extends Item {

    public static Set<Item> ingots = new HashSet<> ();
    public int ingotamount = 0;

    public MaterialIngot (int ingotamount) {
        this.ingotamount = ingotamount;
    }

    @SideOnly(Side.CLIENT)
    public void initModel ( ) {
        setCustomModelResourceLocation ( this , 0 , new ModelResourceLocation ( "metallurgy:materialingot" , "inventory" ) );
    }

    @GameRegistry.ObjectHolder("metallurgy:materialingot")
    public static MaterialIngot materialIngot;

    public static void registerColors ( ) {
        ItemColors ic = Minecraft.getMinecraft ().getItemColors ();
        ic.registerItemColorHandler (
                new IItemColor() {
                    @Override
                    public int colorMultiplier (ItemStack stack , int tintIndex) {
                        if ( stack != ItemStack.EMPTY ) {
                            switch (((MaterialIngot)stack.getItem()).ingotamount) {
                                case 0:	return  0xcafbf6;
                                case 1:	return  0xf4f4f4;
                                case 2:	return  0xf5f7c5;
                                case 3:	return  0xa5a5a5;
                                case 4:	return  0xe0a532;
                                case 5:	return  0x323232;
                                case 6:	return  0x5d5d5d;
                                case 7:	return  0x343434;
                                case 8:	return  0xe2dfb7;
                                case 9:	return  0x383838;
                                case 10: return	0x9e9e9e;
                                case 11: return	0x545454;
                                case 12: return	0x7b7b7b;
                                case 13: return	0x0d0d0d;
                                case 14: return	0x9a998c;
                                case 15: return	0xfcf7c0;
                                case 16: return	0xc3c3c3;
                                case 17: return	0xc5caff;
                                case 18: return	0xff7b00;
                                case 19: return	0x8d8a79;
                                case 20: return	0xf8f8f8;
                                case 21: return	0xececec;
                                case 22: return	0xa1a1a1;
                                case 23: return	0x96bd94;
                                case 24: return	0xd5d5d5;
                                case 25: return	0x2c2c2c;
                                case 26: return	0xffc800;
                                case 27: return	0xb4b4b4;
                                case 28: return	0xa7b3a8;
                                case 29: return	0xececec;
                                case 30: return	0x444257;
                                case 31: return	0x6d6d6d;
                                case 32: return	0xc3c3c3;
                                case 33: return	0xbeafae;
                                case 34: return	0x635c7a;
                                case 35: return	0x646464;
                                case 36: return	0x848484;
                                case 37: return	0xd8d0f2;
                                case 38: return	0xb0daf0;
                                case 39: return	0xd2d2d2;
                                case 40: return	0xfff8dc;
                                case 41: return	0x5c7468;
                                case 42: return	0xa4a4a4;
                                case 43: return	0xeae6be;
                                case 44: return	0xd5f6f5;
                                case 45: return	0xf6f4cb;
                                case 46: return	0xc8aba1;
                                case 47: return	0xf5f5f5;
                                case 48: return	0xe8e8e8;
                                case 49: return	0xd6eccc;
                                case 50: return	0xcdeef0;
                                case 51: return	0xddddd5;
                                case 52: return	0x4b9d3d;
                                case 53: return	0x74eb61;
                                case 54: return	0x505050;
                                case 55: return	0xcbcbcb;
                                case 56: return	0x939393;
                                case 57: return	0x747474;
                                case 58: return	0xbec49a;
                                case 59: return	0xccd0b4;
                                case 60: return	0x252525;
                                case 61: return	0x121212;
                                case 62: return	0xeeeeee;
                                case 63: return	0xeeeeee;
                                case 64: return	0xc3fcff;
                                case 65: return	0xfcff00;
                                case 66: return	0xcecece;
                                case 67: return	0x7b7b7b;
                                case 68: return	0x515150;
                                case 69: return	0x737373;
                                case 70: return	0x565656;
                                case 71: return	0x5b4f4e;
                                case 72: return	0x707070;
                                case 73: return	0xe9e9e9;
                                case 74: return	0xc6c6c6;
                                case 75: return	0x757575;
                                case 76: return	0xe4e589;
                                case 77: return	0xdbdbdb;
                                case 78: return	0xcbcbcb;
                                case 79: return	0x838383;
                                case 80: return	0xe6e6e6;
                                case 81: return	0xf0edd8;
                            }
                        }
                        return 0xffffff;
                    }
                } ,
                ingots.toArray ( new Item[0] ) );
    }
}


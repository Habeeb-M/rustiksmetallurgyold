package com.rustik.metallurgy.items;

import com.rustik.metallurgy.MaterialIngot.MaterialIngot;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static com.rustik.metallurgy.MaterialIngot.MaterialIngot.ingots;

public class ModItems {

    @GameRegistry.ObjectHolder("metallurgy:itemingot")
    public static ItemIngot itemIngot;

    @SideOnly(Side.CLIENT)
    public static void initModels ( ) {
        itemIngot.initModel ();
        for (Item ingot : ingots) {
            ((MaterialIngot) ingot).initModel ();
        }
    }
}


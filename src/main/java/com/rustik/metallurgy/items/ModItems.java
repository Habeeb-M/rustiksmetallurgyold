package com.rustik.metallurgy.items;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems{

    @GameRegistry.ObjectHolder("metallurgy:ItemIngot")
    public static ItemIngot itemIngot;

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        itemIngot.initModel();
    }
}

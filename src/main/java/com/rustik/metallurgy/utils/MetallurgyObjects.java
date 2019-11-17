package com.rustik.metallurgy.utils;

import com.rustik.metallurgy.MaterialSystem.MaterialOre;
import com.rustik.metallurgy.blocks.BlockOre;
import net.minecraft.item.Item;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class MetallurgyObjects {
    //BLOCKS
    @GameRegistry.ObjectHolder("metallurgy:blockore")
    public static final BlockOre blockOre = null;
    @GameRegistry.ObjectHolder("metallurgy:blockore")
    public static final Item itemBlockOre = null;
    @GameRegistry.ObjectHolder("metallurgy:materialore")
    public static MaterialOre materialOre;
    @GameRegistry.ObjectHolder("metallurgy:materialore")
    public static Item itemMaterialOre;
    //FLUIDS
    @GameRegistry.ObjectHolder("metallurgy:lavafelsic")
    public static final BlockFluidClassic lavafelsic = null;
    @GameRegistry.ObjectHolder("metallurgy:lavaintermediate")
    public static final BlockFluidClassic lavaintermediate = null;
    @GameRegistry.ObjectHolder("metallurgy:lavamafic")
    public static final BlockFluidClassic lavamafic = null;
    @GameRegistry.ObjectHolder("metallurgy:lavaultramafic")
    public static final BlockFluidClassic lavaultramafic = null;
    @GameRegistry.ObjectHolder("metallurgy:lavacarbonatitic")
    public static final BlockFluidClassic lavacarbonatitic = null;
    @GameRegistry.ObjectHolder("metallurgy:lavasulfuric")
    public static final BlockFluidClassic lavasulfuric = null;
    @GameRegistry.ObjectHolder("metallurgy:lavaolivinitic")
    public static final BlockFluidClassic lavaolivinitic = null;
}

package com.rustik.metallurgy.fluids;

import com.rustik.metallurgy.metallurgy;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class ModFluids {

    static {
        FluidRegistry.enableUniversalBucket();
    }


    public static Fluid registerFluids(Fluid fluid, Material material)
    {
        Block block = new BlockFluidClassic(fluid, material);
        block.setRegistryName(fluid.getName())
                .setTranslationKey(metallurgy.MODID + "." + fluid.getName());
        if(!FluidRegistry.registerFluid(fluid))
        { fluid = FluidRegistry.getFluid(fluid.getName()); }
        if(fluid.getBlock() == null)
        { fluid.setBlock(block); }
        FluidRegistry.addBucketForFluid(fluid);
        return fluid;
    }

    public static Fluid createFluid(String fluidName)
    {
        return new Fluid(fluidName,
                new ResourceLocation(metallurgy.MODID, "blocks/" + fluidName + "_still"),
                new ResourceLocation(metallurgy.MODID, "blocks/" + fluidName + "_flow"))
                .setUnlocalizedName(metallurgy.MODID + "." + fluidName);
    }
}

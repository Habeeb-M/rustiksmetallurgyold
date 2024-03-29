package com.rustik.metallurgy.utils;

import com.rustik.metallurgy.metallurgy;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.MaterialLiquid;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class MetallurgyFluids {

    private static ResourceLocation createLoc(String name) {
        return new ResourceLocation(metallurgy.MODID,"fluids/" + name);
    }

    public static Fluid addFluid(String fluidName, int density, int viscosity, int luminosity, int temperature) {
        Fluid fluid = new Fluid(fluidName, createLoc(fluidName + "_still"), createLoc(fluidName + "_flow"))
                .setDensity(density)
                .setViscosity(viscosity)
                .setLuminosity(luminosity)
                .setTemperature(temperature);
        FluidRegistry.registerFluid(fluid);
        FluidRegistry.addBucketForFluid(fluid);
        return fluid;
    }

    public static Block addBlock(Fluid fluid, MapColor colour) {
        return new BlockFluidClassic(fluid, new MaterialLiquid(colour))
                .setRegistryName(fluid.getName())
                .setTranslationKey(fluid.getName());
    }
}

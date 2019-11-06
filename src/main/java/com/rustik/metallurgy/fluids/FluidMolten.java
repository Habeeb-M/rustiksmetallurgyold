package com.rustik.metallurgy.fluids;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;

public class FluidMolten extends Fluid{

    public FluidMolten(String fluidName, ResourceLocation still, ResourceLocation flowing) {
        super(fluidName, still, flowing); }

    static Fluid FluidMolten = new ModFluid(
            "fluidMolten",
            (new ResourceLocation("metallurgy", "fluids/fluidmolten_still")),
            (new ResourceLocation("metallurgy", "fluids/fluids/fluidmolten/flow")))
            .setDensity(1100)
            .setGaseous(false)
            .setLuminosity(9)
            .setViscosity(25000)
            .setTemperature(300);
}


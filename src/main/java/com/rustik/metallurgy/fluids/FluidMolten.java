package com.rustik.metallurgy.fluids;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

import java.awt.*;

public class FluidMolten extends Fluid{

    public FluidMolten(String fluidName, ResourceLocation still, ResourceLocation flowing, Color color) {
        super(fluidName, still, flowing, color); }

    static Fluid FluidMolten = new ModFluid(
            "fluidMolten",
            (new ResourceLocation("metallurgy", "fluids/fluidmolten_still")),
            (new ResourceLocation("metallurgy", "fluids/fluids/fluidmolten/flow")),
            Color.RED)
            .setDensity(1100)
            .setGaseous(false)
            .setLuminosity(9)
            .setViscosity(25000)
            .setTemperature(300);

    public static void registerFluids() {
        FluidRegistry.registerFluid(FluidMolten);
    }
}


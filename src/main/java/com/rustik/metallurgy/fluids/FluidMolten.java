package com.rustik.metallurgy.fluids;

import com.rustik.metallurgy.metallurgy;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialLiquid;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;

import java.awt.*;

public class FluidMolten extends Fluid{

    public FluidMolten(String fluidName, ResourceLocation still, ResourceLocation flowing, Color color) {
        super(fluidName, still, flowing, color); }

    public static final Material FLUIDMOLTEN = new MaterialLiquid(
            MapColor.RED);

    public static Fluid FluidMolten = (ModFluid) new ModFluid(
            "FluidMolten",
            new ResourceLocation(metallurgy.MODID,"fluid/fluidmolten_still"),
            new ResourceLocation(metallurgy.MODID, "fluid/fluidmolten_flow")
    )
            .setMaterial(FLUIDMOLTEN)
            .setDensity(1100)
            .setGaseous(false)
            .setLuminosity(9)
            .setViscosity(25000)
            .setTemperature(300);

    public static void registerFluids() {
        FluidMolten = new FluidMolten(
                "fluidMolten",
                (new ResourceLocation("metallurgy", "fluids/fluidmolten_still")),
                (new ResourceLocation("metallurgy", "fluids/fluids/fluidmolten/flow")),
                Color.RED);
    }
}


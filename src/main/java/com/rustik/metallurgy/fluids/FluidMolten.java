package com.rustik.metallurgy.fluids;

import com.rustik.metallurgy.metallurgy;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;

import java.awt.*;

import static com.rustik.metallurgy.fluids.ModFluid.FLUIDMOLTEN;

public class FluidMolten extends Fluid {
    public static final ModFluid FluidMolten = (ModFluid) new ModFluid(
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

    public static FluidMolten fluidMolten;

    public static void registerFluids() {
        fluidMolten = new FluidMolten();
    }
}


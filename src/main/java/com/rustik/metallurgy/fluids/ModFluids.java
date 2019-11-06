package com.rustik.metallurgy.fluids;

import net.minecraftforge.fluids.FluidRegistry;

public class ModFluids {

    static {
        FluidRegistry.enableUniversalBucket();
    }

    public static void registerFluids() {
        FluidRegistry.registerFluid(FluidMolten.FluidMolten);
    }
}

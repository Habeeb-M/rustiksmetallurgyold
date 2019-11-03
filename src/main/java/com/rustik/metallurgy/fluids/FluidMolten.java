package com.rustik.metallurgy.fluids;

import com.rustik.metallurgy.metallurgy;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class FluidMolten extends Fluid {
    FluidMolten() {
        super("moltenfluid",
                new ResourceLocation(metallurgy.MODID, "fluids/fluidmolten_still"),
                new ResourceLocation(metallurgy.MODID, "fluids/fluidmolten_flow"));
        FluidRegistry.registerFluid(this);
    }

    public static FluidMolten fluidMolten;
    public static BlockFluidMolten blockFluidMolten;

    public static void registerFluids() {
        fluidMolten = new FluidMolten();
        blockFluidMolten = new BlockFluidMolten();
    }
    public static void renderFluids() {
        blockFluidMolten.render();
    }


}


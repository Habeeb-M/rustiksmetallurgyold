package com.rustik.metallurgy.fluids;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;

import java.awt.*;

public class FluidInit {
    public static Fluid MoltenFluid;
    public static void Init() {
        MoltenFluid = new FluidMolten("moltenfluid", (new ResourceLocation("metallurgy", "fluids/fluidmolten_still")),
                (new ResourceLocation("metallurgy", "fluids/fluids/fluidmolten/flow")),
                Color.RED);
    }
}

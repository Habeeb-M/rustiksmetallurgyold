package com.rustik.metallurgy.fluids;

import com.rustik.metallurgy.metallurgy;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class ModFluids {

    public static Fluid registerFluids(Fluid fluid, Material material)
    {
        Block block = new BlockFluidClassic(fluid, material);
        block.setRegistryName(fluid.getName())
                .setTranslationKey(metallurgy.MODID + "." + fluid.getName());

        FluidRegistry.addBucketForFluid(fluid);
        return fluid;
    }
}

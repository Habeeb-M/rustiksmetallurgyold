package com.rustik.metallurgy.fluids;

import com.rustik.metallurgy.metallurgy;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class ModFluids {

    public static Fluid createFluid(Fluid fluid)
    {
        return new Fluid(fluid.getName(),
                new ResourceLocation(metallurgy.MODID, "fluids/" + fluid + "_still"),
                new ResourceLocation(metallurgy.MODID, "fluids/" + fluid + "_flow"))
                .setUnlocalizedName(metallurgy.MODID + "." + fluid.getName());
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
}

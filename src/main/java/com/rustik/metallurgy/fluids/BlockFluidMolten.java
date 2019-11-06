package com.rustik.metallurgy.fluids;

import com.rustik.metallurgy.metallurgy;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

import static net.minecraftforge.fml.common.Mod.*;

public class BlockFluidMolten {

    static Fluid fluidMolten = new FluidMolten("fluidMolten",
            (new ResourceLocation("metallurgy", "fluids/fluidmolten_still")),
            (new ResourceLocation("metallurgy", "fluids/fluidmolten_flow")));

    @EventBusSubscriber(modid = metallurgy.MODID, value = Side.CLIENT)
    private static class Client
    {
        @SubscribeEvent
        public static void registerBlockModels(ModelRegistryEvent event)
        {
            ModelLoader.setCustomStateMapper(fluidMolten.getBlock(), new StateMapperBase()
            {
                @Override
                protected ModelResourceLocation getModelResourceLocation(IBlockState state)
                {
                    return new ModelResourceLocation(state.getBlock().getRegistryName(), "fluid");
                }
            });
        }
    }
    public static Fluid createFluid(String fluidName)
    {
        return new Fluid(fluidName,
                new ResourceLocation(metallurgy.MODID, "blocks/" + fluidName + "_still"),
                new ResourceLocation(metallurgy.MODID, "blocks/" + fluidName + "_flow"))
                .setUnlocalizedName(metallurgy.MODID + "." + fluidName);
    }

    public static Fluid registerFluid(Fluid fluid, Material material)
    {
        Block block = new BlockFluidClassic(fluid, material);
        block.setRegistryName(fluid.getName())
                .setTranslationKey(metallurgy.MODID + "." + fluid.getName());

        if(!FluidRegistry.registerFluid(fluid))
        {
            fluid = FluidRegistry.getFluid(fluid.getName());
        }

        if(fluid.getBlock() == null)
        {
            fluid.setBlock(block);
        }

        FluidRegistry.addBucketForFluid(fluid);

        return fluid;
    }
}


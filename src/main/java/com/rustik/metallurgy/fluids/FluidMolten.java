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

public class FluidMolten extends Fluid{

    public FluidMolten(String fluidName, ResourceLocation still, ResourceLocation flowing) {
        super(fluidName, still, flowing); }

    public static Fluid fluidMolten = new ModFluid(
            "fluidMolten",
            (new ResourceLocation("metallurgy", "fluids/fluidmolten_still")),
            (new ResourceLocation("metallurgy", "fluids/fluidmolten_flow")))
            .setDensity(1100)
            .setGaseous(false)
            .setLuminosity(9)
            .setViscosity(25000)
            .setTemperature(300);

    @Mod.EventBusSubscriber(modid = metallurgy.MODID, value = Side.CLIENT)
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
    FluidRegistry.addBucketForFluid(molten);
}


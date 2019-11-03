package com.rustik.metallurgy.fluids;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockFluidMolten extends BlockFluidClassic {
    public BlockFluidMolten() {
        super(FluidMolten.fluidMolten, Material.WATER);
        setRegistryName("fluidmolten");
        setTranslationKey(getRegistryName().toString());
    }
    @SideOnly(Side.CLIENT)
    void render() {
        ModelLoader.setCustomStateMapper(this, new StateMap.Builder().ignore(LEVEL).build());
    }
}

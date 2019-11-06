package com.rustik.metallurgy.fluids;

import net.minecraft.block.material.Material;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidStack;

public class ModFluid extends Fluid{

    protected static int mapColor = 0xFFFF0000;
    protected static float overlayAlpha = 0.2F;
    protected static SoundEvent emptySound = SoundEvents.ITEM_BUCKET_EMPTY;
    protected static SoundEvent fillSound = SoundEvents.ITEM_BUCKET_FILL;
    protected static Material material = Material.WATER;

    public ModFluid(String fluidName, ResourceLocation still, ResourceLocation flowing)
    { super(fluidName, still, flowing); }

    public ModFluid setColor(int parColor)
    { mapColor = parColor;
        return this; }

    public ModFluid setAlpha(float parOverlayAlpha)
    { overlayAlpha = parOverlayAlpha;
        return this; }

    @Override
    public ModFluid setEmptySound(SoundEvent parSound)
    { emptySound = parSound;
        return this; }

    @Override
    public ModFluid setFillSound(SoundEvent parSound)
    { fillSound = parSound;
        return this; }

    public ModFluid setMaterial(Material parMaterial)
    { material = parMaterial;
        return this; }

    public Material getMaterial()
    { return material; }

    @Override
    public boolean doesVaporize(FluidStack fluidStack)
    { if (block == null)
            return false;
        return block.getDefaultState().getMaterial() == getMaterial(); }
}

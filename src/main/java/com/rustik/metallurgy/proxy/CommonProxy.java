package com.rustik.metallurgy.proxy;

import com.rustik.metallurgy.MaterialSystem.MaterialIngot;
//import com.rustik.metallurgy.MaterialSystem.MaterialOreCrushed;
import com.rustik.metallurgy.blocks.ModBlocks;
import com.rustik.metallurgy.blocks.BlockOre;
import com.rustik.metallurgy.fluids.FluidMolten;
import com.rustik.metallurgy.fluids.ModFluids;
import com.rustik.metallurgy.items.ItemIngot;
import com.rustik.metallurgy.metallurgy;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import static com.rustik.metallurgy.MaterialSystem.MaterialIngot.ingots;
import static com.rustik.metallurgy.fluids.FluidMolten.fluidMolten;

@Mod.EventBusSubscriber
public class CommonProxy {

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        ModFluids.registerFluids(ModFluids.createFluid(fluidMolten), Material.LAVA);
    }

    public static void init (FMLInitializationEvent event) {
        MaterialIngot.registerColors();
    }

    public static void postInit (FMLPostInitializationEvent event) {
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().register(new BlockOre ());
    }
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new ItemIngot ());
        event.getRegistry().register(new ItemBlock(ModBlocks.blockOre).setRegistryName(ModBlocks.blockOre.getRegistryName()));

        for(int ingotamount = 0; ingotamount < 82; ingotamount++) {
            Item ingot = new MaterialIngot (ingotamount).setRegistryName("materialingot" + ingotamount).setTranslationKey( metallurgy.MODID + ".materialingot" + ingotamount);
            ingots.add(ingot);
            event.getRegistry().register(ingot);}

        /*for(int orecrushedamount = 0; orecrushedamount < 100; orecrushedamount++) {
            Item orecrushed = new MaterialOreCrushed(orecrushedamount).setRegistryName("materialorecrushed" + orecrushedamount).setTranslationKey(metallurgy.MODID + ".materialorecrushed" + orecrushedamount);
            MaterialOreCrushed.orecrushed.add(orecrushed);
            event.getRegistry().register(orecrushed);

        }*/
    }
}





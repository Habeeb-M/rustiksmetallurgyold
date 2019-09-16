package com.rustik.metallurgy.proxy;

import com.rustik.metallurgy.MaterialIngot.MaterialIngot;
import com.rustik.metallurgy.blocks.ModBlocks;
import com.rustik.metallurgy.blocks.BlockOre;
import com.rustik.metallurgy.items.ItemIngot;
import com.rustik.metallurgy.metallurgy;
import javafx.scene.paint.Material;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import static com.rustik.metallurgy.MaterialIngot.MaterialIngot.ingots;

@Mod.EventBusSubscriber
public class CommonProxy {


    public void preInit(FMLPreInitializationEvent e) {
    }

    public static void init (FMLInitializationEvent event) {
        ClientProxy.registerColors();
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
        for(int i = 0; i < 84; i++) {
            Item ingot = new MaterialIngot (i).setRegistryName("materialingot" + i).setTranslationKey( metallurgy.MODID + ".materialingot" + i);

            ingots.add(ingot);
            event.getRegistry().register(ingot);

        }
    }
}





package com.rustik.metallurgy.proxy;

import com.rustik.metallurgy.MaterialSystem.MaterialIngot;
import com.rustik.metallurgy.MaterialSystem.MaterialOre;
import com.rustik.metallurgy.blocks.ModBlocks;
import com.rustik.metallurgy.blocks.BlockOre;
import com.rustik.metallurgy.fluids.ModFluid;
import com.rustik.metallurgy.items.ItemIngot;
import com.rustik.metallurgy.metallurgy;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
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
import static com.rustik.metallurgy.MaterialSystem.MaterialOre.ores;

@Mod.EventBusSubscriber
public class CommonProxy {

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e) { }

    public static void init (FMLInitializationEvent event) {
        MaterialIngot.registerColors();
    }

    public static void postInit (FMLPostInitializationEvent event) { }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().register(new BlockOre ());
        //FLUIDS
        event.getRegistry().register(ModFluid.addBlock(ModFluid.addFluid("lavafelsic", 300, 3500, 9, 750), MapColor.RED));
        event.getRegistry().register(ModFluid.addBlock(ModFluid.addFluid("lavaintermediate", 250, 2500, 11, 850), MapColor.RED));
        event.getRegistry().register(ModFluid.addBlock(ModFluid.addFluid("lavamafic", 200, 2000, 13, 1000), MapColor.RED));
        event.getRegistry().register(ModFluid.addBlock(ModFluid.addFluid("lavaultramafic", 100, 1000, 15, 1600), MapColor.RED));
        event.getRegistry().register(ModFluid.addBlock(ModFluid.addFluid("lavacarbonatitic", 200, 3500, 8, 550), MapColor.RED));
        event.getRegistry().register(ModFluid.addBlock(ModFluid.addFluid("lavasulfuric", 75, 1200, 13, 150), MapColor.RED));
        event.getRegistry().register(ModFluid.addBlock(ModFluid.addFluid("lavaolivinitic", 200, 2000, 12, 1000), MapColor.RED));
        //AUTO-BLOCKS
        for(int oreamount = 0; oreamount < 100; oreamount++) {Block ore = new MaterialOre(Material.ROCK, MapColor.GRAY, oreamount).setRegistryName("materialore" + oreamount).setTranslationKey(metallurgy.MODID + ".materialingot" + oreamount); ores.add(ore); event.getRegistry().register(ore);}
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new ItemIngot ());
        event.getRegistry().register(new ItemBlock(ModBlocks.blockOre).setRegistryName(ModBlocks.blockOre.getRegistryName()));
        //AUTO-ITEMS
        for(int ingotamount = 0; ingotamount < 82; ingotamount++) { Item ingot = new MaterialIngot (ingotamount).setRegistryName("materialingot" + ingotamount).setTranslationKey( metallurgy.MODID + ".materialingot" + ingotamount); ingots.add(ingot); event.getRegistry().register(ingot);}
    }
}

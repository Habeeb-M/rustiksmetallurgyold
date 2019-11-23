package com.rustik.metallurgy.proxy;

import com.rustik.metallurgy.MaterialSystem.MaterialIngot;
import com.rustik.metallurgy.MaterialSystem.MaterialOre;
import com.rustik.metallurgy.blocks.BlockOre;
import com.rustik.metallurgy.utils.MetallurgyFluids;
import com.rustik.metallurgy.items.ItemIngot;
import com.rustik.metallurgy.metallurgy;
import com.rustik.metallurgy.utils.MetallurgyObjects;
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
        event.getRegistry().register(MetallurgyFluids.addBlock(MetallurgyFluids.addFluid("lavafelsic", 300, 3500, 9, 750), MapColor.RED));
        event.getRegistry().register(MetallurgyFluids.addBlock(MetallurgyFluids.addFluid("lavaintermediate", 250, 2500, 11, 850), MapColor.RED));
        event.getRegistry().register(MetallurgyFluids.addBlock(MetallurgyFluids.addFluid("lavamafic", 200, 2000, 13, 1000), MapColor.RED));
        event.getRegistry().register(MetallurgyFluids.addBlock(MetallurgyFluids.addFluid("lavaultramafic", 100, 1000, 15, 1600), MapColor.RED));
        event.getRegistry().register(MetallurgyFluids.addBlock(MetallurgyFluids.addFluid("lavacarbonatitic", 200, 3500, 8, 550), MapColor.RED));
        event.getRegistry().register(MetallurgyFluids.addBlock(MetallurgyFluids.addFluid("lavasulfuric", 75, 1200, 13, 150), MapColor.RED));
        event.getRegistry().register(MetallurgyFluids.addBlock(MetallurgyFluids.addFluid("lavaolivinitic", 200, 2000, 12, 1000), MapColor.RED));
        //AUTO-BLOCKS
        for(int oreAmount = 0; oreAmount < 100; oreAmount++) {
            Block ore = new MaterialOre(Material.ROCK, MapColor.GRAY, oreAmount)
                    .setRegistryName("materialore" + oreAmount)
                    .setTranslationKey(metallurgy.MODID + ".materialore" + oreAmount);
            ores.add(ore); event.getRegistry().register(ore);}
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new ItemIngot ());
        event.getRegistry().register(new ItemBlock(MetallurgyObjects.blockOre).setRegistryName(MetallurgyObjects.blockOre.getRegistryName()));
        //AUTO-ITEMS
        for(int ingotAmount = 0; ingotAmount < 82; ingotAmount++) { Item ingot = new MaterialIngot (ingotAmount).setRegistryName("materialingot" + ingotAmount).setTranslationKey( metallurgy.MODID + ".materialingot" + ingotAmount); ingots.add(ingot); event.getRegistry().register(ingot);}
    }
}

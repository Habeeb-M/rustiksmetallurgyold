package com.rustik.metallurgy.proxy;

import com.rustik.metallurgy.MaterialSystem.MaterialOre;
import com.rustik.metallurgy.items.ModItems;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

import static com.rustik.metallurgy.utils.MetallurgyObjects.*;

@Mod.EventBusSubscriber(Side.CLIENT)
public class ClientProxy extends CommonProxy {
    @Override
    public void preInit (FMLPreInitializationEvent e) {
        super.preInit ( e );
    }

    @SubscribeEvent
    public static void registerModels (ModelRegistryEvent event) {
        ModItems.initModels ();

        (MaterialOre.ores).stream().forEach((block) ->
            ModelLoader.setCustomModelResourceLocation((Item.getItemFromBlock(block)), 0 , new ModelResourceLocation((block.getRegistryName ()).toString(), "inventory" )));

        //FLUID STATEMAPPERS
        ModelLoader.setCustomStateMapper(lavafelsic, new StateMapperBase() {@Override protected ModelResourceLocation getModelResourceLocation(IBlockState state) { return new ModelResourceLocation(state.getBlock().getRegistryName(), "fluid"); }});
        ModelLoader.setCustomStateMapper(lavaintermediate, new StateMapperBase() {@Override protected ModelResourceLocation getModelResourceLocation(IBlockState state) { return new ModelResourceLocation(state.getBlock().getRegistryName(), "fluid"); }});
        ModelLoader.setCustomStateMapper(lavamafic, new StateMapperBase() {@Override protected ModelResourceLocation getModelResourceLocation(IBlockState state) { return new ModelResourceLocation(state.getBlock().getRegistryName(), "fluid"); }});
        ModelLoader.setCustomStateMapper(lavaultramafic, new StateMapperBase() {@Override protected ModelResourceLocation getModelResourceLocation(IBlockState state) { return new ModelResourceLocation(state.getBlock().getRegistryName(), "fluid"); }});
        ModelLoader.setCustomStateMapper(lavacarbonatitic, new StateMapperBase() {@Override protected ModelResourceLocation getModelResourceLocation(IBlockState state) { return new ModelResourceLocation(state.getBlock().getRegistryName(), "fluid"); }});
        ModelLoader.setCustomStateMapper(lavasulfuric, new StateMapperBase() {@Override protected ModelResourceLocation getModelResourceLocation(IBlockState state) { return new ModelResourceLocation(state.getBlock().getRegistryName(), "fluid"); }});
        ModelLoader.setCustomStateMapper(lavaolivinitic, new StateMapperBase() {@Override protected ModelResourceLocation getModelResourceLocation(IBlockState state) { return new ModelResourceLocation(state.getBlock().getRegistryName(), "fluid"); }});
    }
}

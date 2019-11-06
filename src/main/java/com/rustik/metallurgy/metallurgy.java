package com.rustik.metallurgy;

import com.rustik.metallurgy.fluids.ModFluid;
import com.rustik.metallurgy.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = metallurgy.MODID, name = metallurgy.MODNAME, version = metallurgy.MODVERSION, dependencies = "required-after:forge@[11.16.0.1865,)", useMetadata = true)
public class metallurgy {

    public static final String MODID = "metallurgy";
    public static final String MODNAME = "Rustik's Metallurgy";
    public static final String MODVERSION= "0.0.1";

    @SidedProxy(clientSide = "com.rustik.metallurgy.proxy.ClientProxy", serverSide = "com.rustik.metallurgy.proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static metallurgy instance;

    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
        ModFluid.Init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }


}


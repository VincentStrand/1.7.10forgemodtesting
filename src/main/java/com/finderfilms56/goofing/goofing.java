package com.finderfilms56.goofing;
import com.finderfilms56.goofing.handler.ConfigurationHandler;
import com.finderfilms56.goofing.init.ModBlocks;
import com.finderfilms56.goofing.init.ModItems;
import com.finderfilms56.goofing.proxy.IProxy;
import com.finderfilms56.goofing.reference.Reference;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid= Reference.MOD_ID, version=Reference.MOD_VERSION, name=Reference.MOD_NAME, guiFactory = Reference.GUI_FACTORY_CLASS)
public class goofing {

    @Mod.Instance(Reference.MOD_ID)
    public static goofing instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        //initialize items,blocks, and configs

        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        ModItems.init();
        ModBlocks.init();
    }
    @Mod.EventHandler
    public void Init(FMLInitializationEvent event){
        //register guis, crafting recipies, tile entities
    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }
}

package com.finderfilms56.goofing;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid="goofing", version="1.7.10-1.0", name="Goofing")
public class goofing {
    @Mod.Instance("goofing")
    public static goofing instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        //initialize items.blocks
    }
    @Mod.EventHandler
    public void Init(FMLInitializationEvent event){
        //register guis, crafting recipies, tile entities
    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }
}

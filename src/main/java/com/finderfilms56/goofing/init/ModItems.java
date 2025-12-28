package com.finderfilms56.goofing.init;

import com.finderfilms56.goofing.item.ItemGoofing;
import com.finderfilms56.goofing.item.ItemGreenApple;
import com.finderfilms56.goofing.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {
    public static final ItemGoofing greenapple = new ItemGreenApple();
    public static void init(){
        GameRegistry.registerItem(greenapple, "greenApple");
    }
}

package com.finderfilms56.goofing.init;

import com.finderfilms56.goofing.block.BlockBigGreenApple;
import com.finderfilms56.goofing.block.BlockGoofing;
import com.finderfilms56.goofing.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {
    public static final BlockGoofing bigGreenApple = new BlockBigGreenApple();

    public static void init(){
        GameRegistry.registerBlock(bigGreenApple, "bigGreenApple");
    }
}

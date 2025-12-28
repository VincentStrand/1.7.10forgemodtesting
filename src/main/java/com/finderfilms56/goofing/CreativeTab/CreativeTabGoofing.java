package com.finderfilms56.goofing.CreativeTab;

import com.finderfilms56.goofing.init.ModItems;
import com.finderfilms56.goofing.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabGoofing {
    public static final CreativeTabs GOOFING_TAB = new CreativeTabs(Reference.MOD_ID) {
        @Override
        public Item getTabIconItem() {
            return ModItems.greenapple;
        }

        @Override
        public String getTranslatedTabLabel(){
            return "Goofing";
        }
    };
}

package com.finderfilms56.goofing.block;

import com.finderfilms56.goofing.CreativeTab.CreativeTabGoofing;
import com.finderfilms56.goofing.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemStack;

public class BlockGoofing extends Block {
    public BlockGoofing(Material material){
        super(material);
        this.setCreativeTab(CreativeTabGoofing.GOOFING_TAB);
    }
    public BlockGoofing(){
        this(Material.rock);
    }
    @Override
    public String getUnlocalizedName(){
        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }
    /*
    @Override
    public String getUnlocalizedName(ItemStack itemStack){
        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }
    */
    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister){
        blockIcon =iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName){
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}

package com.invironz.vorpaltek.common.block.base;

import com.invironz.vorpaltek.VorpalTek;
import com.invironz.vorpaltek.lib.VorpalTekNames;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

/**
 * Created by charmquark on 1/10/2017.
 */
public class VorpalTekBlock extends Block {
    public VorpalTekBlock(Material material, String name) {
        super(material);
        setName(name);
    }

    public VorpalTekBlock setName(String name) {
        setUnlocalizedName(VorpalTekNames.PREFIX + name);
        setRegistryName(name);
        return this;
    }

    public void registerItemModel(ItemBlock itemBlock) {
        VorpalTek.proxy.registerItemRenderer(itemBlock, 0);
    }
}

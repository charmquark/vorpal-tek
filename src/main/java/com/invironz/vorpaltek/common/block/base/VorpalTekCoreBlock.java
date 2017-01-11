package com.invironz.vorpaltek.common.block.base;

import com.invironz.vorpaltek.creativetab.VorpalTekCreativeTabs;
import net.minecraft.block.material.Material;

/**
 * Created by charmquark on 1/10/2017.
 */
public class VorpalTekCoreBlock extends VorpalTekBlock {
    public VorpalTekCoreBlock(Material material, String name) {
        super(material, name);
        setCreativeTab(VorpalTekCreativeTabs.VORPALTEK_CORE);
    }
}

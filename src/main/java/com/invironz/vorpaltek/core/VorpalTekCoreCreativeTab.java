package com.invironz.vorpaltek.core;

import com.invironz.vorpaltek.core.common.item.VorpalTekCoreItems;
import com.invironz.vorpaltek.core.lib.VorpalTekCoreNames;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

/**
 * Created by charmquark on 1/9/2017.
 */
public class VorpalTekCoreCreativeTab extends CreativeTabs {
    private static VorpalTekCoreCreativeTab instance;

    public static VorpalTekCoreCreativeTab getInstance() {
        if (instance == null) {
            instance = new VorpalTekCoreCreativeTab();
        }
        return instance;
    }

    public VorpalTekCoreCreativeTab() {
        super(VorpalTekCoreNames.CREATIVE_TAB_NAME);
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(VorpalTekCoreItems.STEEL_INGOT);
    }
}

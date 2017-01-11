package com.invironz.vorpaltek.creativetab;

import com.invironz.vorpaltek.common.item.VorpalTekCoreItems;
import com.invironz.vorpaltek.lib.VorpalTekCoreNames;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import javax.annotation.Nonnull;

/**
 * Created by charmquark on 1/10/2017.
 */
public abstract class VorpalTekCreativeTabs extends CreativeTabs {
    public static final VorpalTekCreativeTabs VORPALTEK_CORE = new VorpalTekCoreCreativeTab();

    VorpalTekCreativeTabs(String label) {
        super(label);
    }

    @Override
    @Nonnull
    public abstract ItemStack getTabIconItem();
}

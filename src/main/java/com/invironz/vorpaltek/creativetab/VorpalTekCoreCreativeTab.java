package com.invironz.vorpaltek.creativetab;

import com.invironz.vorpaltek.common.item.VorpalTekCoreItems;
import com.invironz.vorpaltek.lib.VorpalTekCoreNames;
import net.minecraft.item.ItemStack;

import javax.annotation.Nonnull;

/**
 * Created by charmquark on 1/10/2017.
 */
public final class VorpalTekCoreCreativeTab extends VorpalTekCreativeTabs {
    VorpalTekCoreCreativeTab() {
        super(VorpalTekCoreNames.CREATIVE_TAB_NAME);
    }

    @Override
    @Nonnull
    public ItemStack getTabIconItem() {
        return new ItemStack(VorpalTekCoreItems.ADAMANT_INGOT);
    }
}

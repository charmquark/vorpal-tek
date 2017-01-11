package com.invironz.vorpaltek.common.item.base;

import com.invironz.vorpaltek.creativetab.VorpalTekCreativeTabs;

/**
 * Created by charmquark on 1/9/2017.
 */
public abstract class VorpalTekCoreItem extends VorpalTekItem {
    public VorpalTekCoreItem(String name) {
        super(name, VorpalTekCreativeTabs.VORPALTEK_CORE);
    }

    protected VorpalTekCoreItem() {
        super();
        setCreativeTab(VorpalTekCreativeTabs.VORPALTEK_CORE);
    }
}

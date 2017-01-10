package com.invironz.vorpaltek.core.common.item.base;

import com.invironz.vorpaltek.common.item.base.VorpalTekItem;
import com.invironz.vorpaltek.core.VorpalTekCoreCreativeTab;

/**
 * Created by charmquark on 1/9/2017.
 */
public class VorpalTekCoreItem extends VorpalTekItem {
    public VorpalTekCoreItem(String name) {
        super(name, VorpalTekCoreCreativeTab.getInstance());
    }

    protected VorpalTekCoreItem() {
        super();
    }
}

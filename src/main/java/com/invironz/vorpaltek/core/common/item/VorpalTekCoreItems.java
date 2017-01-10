package com.invironz.vorpaltek.core.common.item;

import com.invironz.vorpaltek.common.item.VorpalTekItems;
import com.invironz.vorpaltek.common.item.base.VorpalTekItem;
import com.invironz.vorpaltek.core.common.item.base.VorpalTekCoreItem;
import com.invironz.vorpaltek.core.lib.VorpalTekCoreNames;

/**
 * Created by charmquark on 1/9/2017.
 */
public class VorpalTekCoreItems extends VorpalTekItems {
    public static final VorpalTekCoreItem   ADAMANT_INGOT    = new ItemAdamantIngot(),
                                            MITHRIL_INGOT    = new ItemMithrilIngot(),
                                            ORICHALCUM_INGOT = new ItemOrichalcumIngot(),
                                            STEEL_INGOT      = new ItemSteelIngot();

    public static void init() {
        // recipes
    }

    public static void preInit() {
        register(STEEL_INGOT);
        register(ADAMANT_INGOT);
        register(MITHRIL_INGOT);
        register(ORICHALCUM_INGOT);
    }
}

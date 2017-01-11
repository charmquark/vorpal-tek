package com.invironz.vorpaltek.common.item;

import com.invironz.vorpaltek.common.item.base.VorpalTekItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by charmquark on 1/9/2017.
 */
public abstract class VorpalTekItems {
    public static void init() {
        VorpalTekCoreItems.init();
    }

    public static void preInit() {
        VorpalTekCoreItems.preInit();
    }

    protected static void registerItem(Item item) {
        GameRegistry.register(item);
        if (item instanceof VorpalTekItem) {
            ((VorpalTekItem) item).registerItemModel();
        }
    }
}

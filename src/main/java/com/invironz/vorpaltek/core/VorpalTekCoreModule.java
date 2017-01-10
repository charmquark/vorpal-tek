package com.invironz.vorpaltek.core;

import com.invironz.vorpaltek.core.common.item.VorpalTekCoreItems;
import com.invironz.vorpaltek.lib.VorpalTekModule;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by charmquark on 1/9/2017.
 */
public class VorpalTekCoreModule extends VorpalTekModule {
    private static VorpalTekCoreModule instance;

    public static VorpalTekCoreModule getInstance() {
        if (instance == null) {
            instance = new VorpalTekCoreModule();
        }
        return instance;
    }

    @Override
    public void init(FMLInitializationEvent event) {
        VorpalTekCoreItems.init();
    }

    @Override
    public void preInit(FMLPreInitializationEvent event) {
        VorpalTekCoreItems.preInit();
    }
}

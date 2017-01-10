package com.invironz.vorpaltek.proxy;

import com.invironz.vorpaltek.VorpalTek;
import com.invironz.vorpaltek.lib.IVorpalTekModule;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by charmquark on 1/9/2017.
 */
public class CommonProxy {
    public void init(FMLInitializationEvent event) {
        for (IVorpalTekModule module: VorpalTek.instance.getModules()) {
            module.init(event);
        }
    }

    public void postInit(FMLPostInitializationEvent event) {
        for (IVorpalTekModule module: VorpalTek.instance.getModules()) {
            module.postInit(event);
        }
    }

    public void preInit(FMLPreInitializationEvent event) {
        for (IVorpalTekModule module: VorpalTek.instance.getModules()) {
            module.preInit(event);
        }
    }

    public void registerItemRenderer(Item item, int meta) {

    }
}

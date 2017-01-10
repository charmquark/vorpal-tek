package com.invironz.vorpaltek;

import com.invironz.vorpaltek.lib.Names;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by charmquark on 1/9/2017.
 */
@Mod(modid = Names.MOD_ID, name = Names.MOD_NAME, version = Names.VERSION, useMetadata = true)
public class VorpalTek {
    @Mod.Instance(Names.MOD_ID)
    public static VorpalTek instance;

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {

    }
}

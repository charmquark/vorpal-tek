package com.invironz.vorpaltek;

import com.invironz.vorpaltek.lib.VorpalTekNames;
import com.invironz.vorpaltek.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by charmquark on 1/9/2017.
 */
@Mod(modid = VorpalTekNames.MOD_ID, name = VorpalTekNames.MOD_NAME, version = VorpalTekNames.VERSION, useMetadata = true)
public final class VorpalTek {
    @Mod.Instance(VorpalTekNames.MOD_ID)
    public static VorpalTek instance;

    @SidedProxy(clientSide = VorpalTekNames.PROXY_CLIENT, serverSide = VorpalTekNames.PROXY_SERVER)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }
}

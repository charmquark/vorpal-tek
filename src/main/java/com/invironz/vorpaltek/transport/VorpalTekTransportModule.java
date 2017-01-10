package com.invironz.vorpaltek.transport;

import com.invironz.vorpaltek.lib.VorpalTekModule;
import net.minecraftforge.fml.common.Mod;

/**
 * Created by charmquark on 1/9/2017.
 */
public class VorpalTekTransportModule extends VorpalTekModule {
    private static VorpalTekTransportModule instance;

    public static VorpalTekTransportModule getInstance() {
        if (instance == null) {
            instance = new VorpalTekTransportModule();
        }
        return instance;
    }
}

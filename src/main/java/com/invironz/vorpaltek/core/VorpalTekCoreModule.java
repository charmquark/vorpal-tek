package com.invironz.vorpaltek.core;

import com.invironz.vorpaltek.lib.VorpalTekModule;

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
}

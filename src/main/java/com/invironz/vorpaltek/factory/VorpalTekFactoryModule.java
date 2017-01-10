package com.invironz.vorpaltek.factory;

import com.invironz.vorpaltek.lib.VorpalTekModule;

/**
 * Created by charmquark on 1/9/2017.
 */
public class VorpalTekFactoryModule extends VorpalTekModule {
    private static VorpalTekFactoryModule instance;

    public static VorpalTekFactoryModule getInstance() {
        if (instance == null) {
            instance = new VorpalTekFactoryModule();
        }
        return instance;
    }
}

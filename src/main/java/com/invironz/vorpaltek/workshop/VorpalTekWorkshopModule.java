package com.invironz.vorpaltek.workshop;

import com.invironz.vorpaltek.lib.VorpalTekModule;

/**
 * Created by charmquark on 1/9/2017.
 */
public class VorpalTekWorkshopModule extends VorpalTekModule {
    private static VorpalTekWorkshopModule instance;

    public static VorpalTekWorkshopModule getInstance() {
        if (instance == null) {
            instance = new VorpalTekWorkshopModule();
        }
        return instance;
    }
}

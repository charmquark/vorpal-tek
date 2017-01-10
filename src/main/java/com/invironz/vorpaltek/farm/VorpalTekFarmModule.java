package com.invironz.vorpaltek.farm;

import com.invironz.vorpaltek.lib.VorpalTekModule;

/**
 * Created by charmquark on 1/9/2017.
 */
public class VorpalTekFarmModule extends VorpalTekModule {
    private static VorpalTekFarmModule instance;

    public static VorpalTekFarmModule getInstance() {
        if (instance == null) {
            instance = new VorpalTekFarmModule();
        }
        return instance;
    }
}

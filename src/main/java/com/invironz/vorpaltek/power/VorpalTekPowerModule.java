package com.invironz.vorpaltek.power;

import com.invironz.vorpaltek.lib.VorpalTekModule;

/**
 * Created by charmquark on 1/9/2017.
 */
public class VorpalTekPowerModule extends VorpalTekModule {
    private static VorpalTekPowerModule instance;

    public static VorpalTekPowerModule getInstance() {
        if (instance == null) {
            instance = new VorpalTekPowerModule();
        }
        return instance;
    }
}

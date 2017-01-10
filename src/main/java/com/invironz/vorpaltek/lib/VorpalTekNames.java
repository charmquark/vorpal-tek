package com.invironz.vorpaltek.lib;

/**
 * Created by charmquark on 1/9/2017.
 */
public final class VorpalTekNames {
    public static final String BUILD    = "GRADLE:BUILD";
    public static final String MOD_ID   = "vorpaltek";
    public static final String MOD_NAME = "VorpalTek";
    public static final String PKG      = "com.invironz." + MOD_ID + ".";
    public static final String VERSION  = "GRADLE:VERSION-" + BUILD;

    public static final String PREFIX = MOD_ID.toLowerCase() + ":";

    public static final String PROXY_PKG = PKG + "proxy.";
    public static final String PROXY_COMMON = PROXY_PKG + "CommonProxy";
    public static final String PROXY_CLIENT = PROXY_PKG + "ClientProxy";
    public static final String PROXY_SERVER = PROXY_COMMON;

    public static final String SUFFIX_BLOCK = "_block";
    public static final String SUFFIX_INGOT = "_ingot";
}

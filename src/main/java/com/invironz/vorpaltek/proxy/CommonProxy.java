package com.invironz.vorpaltek.proxy;

import com.invironz.vorpaltek.common.block.VorpalTekBlocks;
import com.invironz.vorpaltek.common.item.VorpalTekItems;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by charmquark on 1/9/2017.
 */
public class CommonProxy {
    public void init(FMLInitializationEvent event) {
        VorpalTekItems.init();
        VorpalTekBlocks.init();
    }

    public void postInit(FMLPostInitializationEvent event) {
    }

    public void preInit(FMLPreInitializationEvent event) {
        VorpalTekItems.preInit();
        VorpalTekBlocks.preInit();
    }

    public void registerItemRenderer(Item item, int meta) {

    }
}

package com.invironz.vorpaltek.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

/**
 * Created by charmquark on 1/9/2017.
 */
public class ClientProxy extends CommonProxy {
    @Override
    public void registerItemRenderer(Item item, int meta) {
        ModelResourceLocation resourceLoc = new ModelResourceLocation(
            item.getRegistryName(),
            "inventory"
        );
        ModelLoader.setCustomModelResourceLocation(item, meta, resourceLoc);
    }
}

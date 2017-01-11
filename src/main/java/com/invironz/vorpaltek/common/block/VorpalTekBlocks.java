package com.invironz.vorpaltek.common.block;

import com.invironz.vorpaltek.common.block.base.VorpalTekBlock;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by charmquark on 1/10/2017.
 */
public abstract class VorpalTekBlocks {
    public static void init() {
        VorpalTekCoreBlocks.init();
    }

    public static void preInit() {
        VorpalTekCoreBlocks.preInit();
    }

    protected static void registerBlock(Block block) {
        ItemBlock itemBlock = new ItemBlock(block);
        itemBlock.setRegistryName(block.getRegistryName());
        registerBlock(block, itemBlock);
    }

    protected static void registerBlock(Block block, ItemBlock itemBlock) {
        GameRegistry.register(block);
        GameRegistry.register(itemBlock);
        if (block instanceof VorpalTekBlock) {
            ((VorpalTekBlock) block).registerItemModel(itemBlock);
        }
    }
}

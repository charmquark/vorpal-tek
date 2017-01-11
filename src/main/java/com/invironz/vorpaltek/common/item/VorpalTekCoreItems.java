package com.invironz.vorpaltek.common.item;

import com.invironz.vorpaltek.common.block.VorpalTekCoreBlocks;
import com.invironz.vorpaltek.common.item.core.*;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by charmquark on 1/9/2017.
 */
public final class VorpalTekCoreItems extends VorpalTekItems {
    public static final Item ADAMANT_INGOT    = new ItemAdamantIngot(),
                             MITHRIL_INGOT    = new ItemMithrilIngot(),
                             ORICHALCUM_INGOT = new ItemOrichalcumIngot(),
                             STEEL_INGOT      = new ItemSteelIngot();

    private static void addMetalIngotsFromBlockRecipe(Item ingot, Block block) {
        GameRegistry.addShapelessRecipe(new ItemStack(ingot, 9), block);
    }

    public static void init() {
        initBasicRecipes();
    }

    private static void initBasicRecipes() {
        addMetalIngotsFromBlockRecipe(STEEL_INGOT,      VorpalTekCoreBlocks.STEEL_BLOCK);
        addMetalIngotsFromBlockRecipe(ADAMANT_INGOT,    VorpalTekCoreBlocks.ADAMANT_BLOCK);
        addMetalIngotsFromBlockRecipe(MITHRIL_INGOT,    VorpalTekCoreBlocks.MITHRIL_BLOCK);
        addMetalIngotsFromBlockRecipe(ORICHALCUM_INGOT, VorpalTekCoreBlocks.ORICHALCUM_BLOCK);
    }

    public static void preInit() {
        registerItem(STEEL_INGOT);
        registerItem(ADAMANT_INGOT);
        registerItem(MITHRIL_INGOT);
        registerItem(ORICHALCUM_INGOT);
    }
}

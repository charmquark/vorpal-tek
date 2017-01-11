package com.invironz.vorpaltek.common.block;

import com.invironz.vorpaltek.common.block.core.BlockAdamant;
import com.invironz.vorpaltek.common.block.core.BlockMithril;
import com.invironz.vorpaltek.common.block.core.BlockOrichalcum;
import com.invironz.vorpaltek.common.block.core.BlockSteel;
import com.invironz.vorpaltek.common.item.VorpalTekCoreItems;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by charmquark on 1/10/2017.
 */
public final class VorpalTekCoreBlocks extends VorpalTekBlocks {
    public static final Block STEEL_BLOCK      = new BlockSteel();
    public static final Block ADAMANT_BLOCK    = new BlockAdamant();
    public static final Block MITHRIL_BLOCK    = new BlockMithril();
    public static final Block ORICHALCUM_BLOCK = new BlockOrichalcum();

    private static void addMetalBlockFromIngotsRecipe(Block block, Item ingot) {
        GameRegistry.addShapelessRecipe(new ItemStack(block), ingot, ingot, ingot, ingot, ingot, ingot, ingot, ingot, ingot);
    }

    public static void init() {
        initBasicRecipes();
    }

    private static void initBasicRecipes() {
        addMetalBlockFromIngotsRecipe(STEEL_BLOCK,      VorpalTekCoreItems.STEEL_INGOT);
        addMetalBlockFromIngotsRecipe(ADAMANT_BLOCK,    VorpalTekCoreItems.ADAMANT_INGOT);
        addMetalBlockFromIngotsRecipe(MITHRIL_BLOCK,    VorpalTekCoreItems.MITHRIL_INGOT);
        addMetalBlockFromIngotsRecipe(ORICHALCUM_BLOCK, VorpalTekCoreItems.ORICHALCUM_INGOT);
    }

    public static void preInit() {
        registerBlock(STEEL_BLOCK);
        registerBlock(ADAMANT_BLOCK);
        registerBlock(MITHRIL_BLOCK);
        registerBlock(ORICHALCUM_BLOCK);
    }
}

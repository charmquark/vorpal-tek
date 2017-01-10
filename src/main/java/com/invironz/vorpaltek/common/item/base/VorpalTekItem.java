package com.invironz.vorpaltek.common.item.base;

import com.invironz.vorpaltek.VorpalTek;
import com.invironz.vorpaltek.lib.VorpalTekNames;
import com.sun.istack.internal.NotNull;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Created by charmquark on 1/9/2017.
 */
public class VorpalTekItem extends Item {
    private boolean shiny = false;

    public VorpalTekItem(String name) {
        super();
        setName(name);
    }

    public VorpalTekItem(String name, CreativeTabs creativeTab) {
        this(name);
        setCreativeTab(creativeTab);
    }

    protected VorpalTekItem() {
        super();
    }

    @Override
    public boolean hasEffect(@NotNull ItemStack stack) {
        if (shiny) {
            return true;
        } else {
            return super.hasEffect(stack);
        }
    }

    public void registerItemModel() {
        VorpalTek.proxy.registerItemRenderer(this, 0);
    }

    private void setName(String name) {
        setUnlocalizedName(VorpalTekNames.PREFIX + name);
        setRegistryName(name);
    }

    public void setShiny(boolean value) {
        shiny = value;
    }
}

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
public abstract class VorpalTekItem extends Item {
    protected VorpalTekItem() {
        super();
    }

    public VorpalTekItem(String name) {
        this();
        setName(name);
    }

    public VorpalTekItem(CreativeTabs creativeTab) {
        this();
        setCreativeTab(creativeTab);
    }

    public VorpalTekItem(String name, CreativeTabs creativeTab) {
        this(name);
        setCreativeTab(creativeTab);
    }

    public void registerItemModel() {
        VorpalTek.proxy.registerItemRenderer(this, 0);
    }

    private void setName(String name) {
        setUnlocalizedName(VorpalTekNames.PREFIX + name);
        setRegistryName(name);
    }
}

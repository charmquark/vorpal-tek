package com.invironz.vorpaltek.lib;

import javax.annotation.Nonnull;
import java.util.ArrayList;

/**
 * Created by charmquark on 1/10/2017.
 */
public final class VorpalTekMetals {
    public static final ArrayList<VorpalTekMetals> ALL = new ArrayList<VorpalTekMetals>(4);

    public static final VorpalTekMetals STEEL      = new VorpalTekMetals(VorpalTekCoreNames.STEEL,      0),
                                        ADAMANT    = new VorpalTekMetals(VorpalTekCoreNames.ADAMANT,    1),
                                        MITHRIL    = new VorpalTekMetals(VorpalTekCoreNames.MITHRIL,    2),
                                        ORICHALCUM = new VorpalTekMetals(VorpalTekCoreNames.ORICHALCUM, 3);

    @Nonnull
    public static VorpalTekMetals fromMetadata(int metadata) {
        VorpalTekMetals result = ALL.get(metadata);
        if (result == null) throw new AssertionError();
        return result;
    }

    private int     metadata;
    private String  name;

    private VorpalTekMetals(@Nonnull String paramName, int paramMetadata) {
        metadata = paramMetadata;
        name     = paramName;
        ALL.add(metadata, this);
    }

    public int getMetadata() { return metadata; }

    @Nonnull
    public String getName() { return name; }
}

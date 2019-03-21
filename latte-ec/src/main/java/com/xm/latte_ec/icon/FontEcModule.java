package com.xm.latte_ec.icon;

import com.joanzapata.iconify.Icon;
import com.joanzapata.iconify.IconFontDescriptor;

/**
 * Created by lzh on 2019/3/7/007.
 */

public class FontEcModule implements IconFontDescriptor {
    @Override
    public String ttfFileName() {
        return null;
    }

    @Override
    public Icon[] characters() {
        return EcIcons.values();
    }
}

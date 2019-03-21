package com.xm.festdemo;

import android.app.Application;

import com.joanzapata.iconify.fonts.FontAwesomeModule;
import com.xm.late_core.app.Latte;
import com.xm.latte_ec.icon.FontEcModule;

/**
 * Created by liaozhihua on 2019/3/7.
 */

public class ExampleApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Latte.init(this)
                .withIcon(new FontAwesomeModule())
                .withIcon(new FontEcModule())
                .withApiHost("http://127.0.0.1")
                .configure();
    }
}

package com.example.handset;

import android.app.Application;
import com.example.core.CoreComponent;
import com.example.core.CoreComponentInjector;
import com.example.core.CoreModule;
import com.example.core.DaggerCoreComponent;
import com.example.net.NetModule;

public class HandsetApplication extends Application implements CoreComponentInjector {

    private CoreComponent coreComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        coreComponent = DaggerCoreComponent.builder()
                .coreModule(new CoreModule())
                .netModule(new NetModule())
                .build();
    }

    @Override
    public CoreComponent getCoreComponent() {
        return coreComponent;
    }
}

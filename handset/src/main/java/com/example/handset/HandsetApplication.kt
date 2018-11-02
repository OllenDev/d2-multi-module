package com.example.handset

import android.app.Application
import com.example.core.CoreComponent
import com.example.core.CoreComponentInjector
import com.example.core.CoreModule
import com.example.core.DaggerCoreComponent
import com.example.net.NetModule

class HandsetApplication : Application(), CoreComponentInjector {

    override lateinit var coreComponent: CoreComponent

    override fun onCreate() {
        super.onCreate()
        coreComponent = DaggerCoreComponent.builder()
            .coreModule(CoreModule())
            .netModule(NetModule())
            .build()
    }
}

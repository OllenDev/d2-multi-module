package com.example.core

import dagger.Module
import dagger.Provides

import javax.inject.Singleton

@Module
class CoreModule {

    @Singleton
    @Provides
    internal fun provideMyCoreThing(): MyCoreThing {
        return MyCoreThing()
    }
}

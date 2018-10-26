package com.example.core;

import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module
public class CoreModule {

    @Singleton
    @Provides
    MyCoreThing provideMyCoreThing() {
        return new MyCoreThing();
    }
}

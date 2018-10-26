package com.example.net;

import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module
public class NetModule {

    @Singleton
    @Provides
    NetworkApi provideNetworkApi() {
        return new NetworkApi();
    }

}

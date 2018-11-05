package com.example.net

import dagger.Module
import dagger.Provides

import javax.inject.Singleton

@Module
class NetModule {

    @Provides
    @Singleton
    fun provideNetworkApi(): NetworkApi {
        return NetworkApi()
    }
}

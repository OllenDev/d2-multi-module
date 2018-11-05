package com.example.feed

import dagger.Module
import dagger.Provides

import javax.inject.Named

@Module
class FeedModule {

    @Provides
    @Named("test")
    internal fun provideTestString(): String {
        return "test"
    }
}

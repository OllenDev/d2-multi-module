package com.example.feed;

import dagger.Module;
import dagger.Provides;

import javax.inject.Named;

@Module
public class FeedModule {

    @Provides
    @Named("test")
    String provideTestString() {
        return "test";
    }
}

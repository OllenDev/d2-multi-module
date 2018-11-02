package com.example.clubs

import dagger.Module
import dagger.Provides

import javax.inject.Named

@Module
class ClubsModule {

    @Provides
    @Named("clubs")
    internal fun provideClubs(): String {
        return "clubs"
    }
}

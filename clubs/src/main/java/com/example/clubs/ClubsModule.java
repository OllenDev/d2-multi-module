package com.example.clubs;

import dagger.Module;
import dagger.Provides;

import javax.inject.Named;

@Module
public class ClubsModule {

    @Provides
    @Named("clubs")
    String provideClubs() {
        return "clubs";
    }
}

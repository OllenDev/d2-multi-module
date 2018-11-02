package com.example.core

import com.example.net.NetModule
import com.example.net.NetworkApi
import dagger.Component

import javax.inject.Singleton

@Singleton
@Component(modules = [CoreModule::class, NetModule::class])
interface CoreComponent {

    fun coreThing(): MyCoreThing
    fun networkApi(): NetworkApi

}

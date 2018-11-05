package com.example.feed

import com.example.core.ActivityScope
import com.example.core.CoreComponent
import dagger.Component

@ActivityScope
@Component(dependencies = arrayOf(CoreComponent::class), modules = arrayOf(FeedModule::class))
interface FeedComponent {

    fun inject(activity: FeedActivity)

}

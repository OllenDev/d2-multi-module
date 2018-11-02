package com.example.clubs

import com.example.core.ActivityScope
import com.example.core.CoreComponent
import dagger.Component

@ActivityScope
@Component(dependencies = [CoreComponent::class], modules = [ClubsModule::class])
interface ClubsComponent {

    fun inject(activity: ClubsActivity)

}

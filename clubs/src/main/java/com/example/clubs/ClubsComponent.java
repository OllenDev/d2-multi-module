package com.example.clubs;

import com.example.core.ActivityScope;
import com.example.core.CoreComponent;
import dagger.Component;

@ActivityScope
@Component(
        dependencies = CoreComponent.class,
        modules = ClubsModule.class
)
public interface ClubsComponent {

    void inject(ClubsActivity activity);

}

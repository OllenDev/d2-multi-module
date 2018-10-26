package com.example.feed;

import com.example.core.ActivityScope;
import com.example.core.CoreComponent;
import dagger.Component;

@ActivityScope
@Component(
        dependencies = CoreComponent.class,
        modules = FeedModule.class
)
public interface FeedComponent {

    void inject(FeedActivity activity);

}

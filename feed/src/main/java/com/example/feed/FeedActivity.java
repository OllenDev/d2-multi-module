package com.example.feed;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import com.example.core.CoreComponent;
import com.example.core.CoreComponentInjector;
import com.example.core.MyCoreThing;
import com.example.net.NetworkApi;

import javax.inject.Inject;

public class FeedActivity extends AppCompatActivity {

    @Inject
    NetworkApi networkApi;

    @Inject
    MyCoreThing coreThing;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);

        CoreComponent coreComponent = ((CoreComponentInjector) getApplication()).getCoreComponent();
        DaggerFeedComponent.builder()
                .coreComponent(coreComponent)
                .build()
                .inject(this);

        Button button = findViewById(R.id.goToClubsButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("mmd2://clubs"));
                startActivity(intent);
            }
        });
    }
}

package com.example.feed

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.core.CoreComponentInjector
import com.example.core.MyCoreThing
import com.example.net.NetworkApi
import kotlinx.android.synthetic.main.activity_feed.*
import javax.inject.Inject

class FeedActivity : AppCompatActivity() {

    @Inject
    lateinit var networkApi: NetworkApi

    @Inject
    lateinit var coreThing: MyCoreThing

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feed)

        val coreComponent = (application as CoreComponentInjector).coreComponent
        DaggerFeedComponent.builder()
            .coreComponent(coreComponent)
            .build()
            .inject(this)

        goToClubsButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("mmd2://clubs"))
            startActivity(intent)
        }
    }
}

package com.example.clubs

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import com.example.core.CoreComponent
import com.example.core.CoreComponentInjector
import com.example.core.MyCoreThing
import com.example.net.NetworkApi
import kotlinx.android.synthetic.main.activity_clubs.*

import javax.inject.Inject

class ClubsActivity : AppCompatActivity() {

    @Inject
    lateinit var networkApi: NetworkApi

    @Inject
    lateinit var coreThing: MyCoreThing

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clubs)

        val coreComponent = (application as CoreComponentInjector).coreComponent
        DaggerClubsComponent.builder()
            .coreComponent(coreComponent)
            .build()
            .inject(this)

        goToFeedButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("mmd2://feed"))
            startActivity(intent)
        }
    }
}

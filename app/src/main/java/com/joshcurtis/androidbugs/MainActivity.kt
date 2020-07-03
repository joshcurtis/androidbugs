package com.joshcurtis.androidbugs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.GONE
import android.widget.ImageButton
import androidx.media2.widget.MediaControlView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val view: MediaControlView = findViewById(R.id.media_controller)
        view.setOnFullScreenListener(null)
        /* workaround to hide the fullscreen button
        val button: ImageButton = findViewById(R.id.minimal_fullscreen)
        button.visibility = GONE
         */
    }
}
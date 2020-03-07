package com.davemorrissey.labs.subscaleview.test

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.pages_activity.*

class BasicFeaturesActivity : AppCompatActivity() {
    val images = listOf("sanmartino 2000x1334.jpg", "card.png", "card 125x100.png")
    var index = 0

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pages_activity)
        actionBar?.title = getString(R.string.basic_title)
        switchImage()
    }

    fun switchImage(menuItem: MenuItem? = null) {
        imageView.setImage("/android_asset/${images[index]}")
        ++index
        index %= images.size
    }
}

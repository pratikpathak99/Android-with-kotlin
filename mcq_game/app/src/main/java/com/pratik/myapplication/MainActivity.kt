package com.pratik.myapplication

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val SPASHTIMOUT = 4000
    var applogo: ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar!!.hide()

        applogo = findViewById(R.id.logo)

        val myanim = AnimationUtils.loadAnimation(this, R.anim.mytransition)
        applogo?.setAnimation(myanim)

        Handler().postDelayed({
            intent = Intent(applicationContext,Home_Page::class.java)
            startActivity(intent)
            finish()
        }, SPASHTIMOUT.toLong())

    }
}
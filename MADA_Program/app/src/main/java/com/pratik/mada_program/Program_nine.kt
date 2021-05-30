package com.pratik.mada_program

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Program_nine : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_program_nine)

        supportActionBar?.hide()
    }

    fun activ(view: View) {
        intent = Intent(Intent.ACTION_VIEW)
        intent.setData(Uri.parse("https://nextgencafe20.blogspot.com/"))
        startActivity(intent)
    }
}
package com.pratik.mada_program

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class program_eleven : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_program_eleven)

        supportActionBar?.hide()
        Toast.makeText(applicationContext, "onCreate invoked", Toast.LENGTH_SHORT).show()
    }
    override fun onStart() {
        super.onStart()
        Toast.makeText(applicationContext, "onStart invoked", Toast.LENGTH_SHORT).show()
    }
    override fun onResume() {
        super.onResume()
        Toast.makeText(applicationContext, "onResume invoked", Toast.LENGTH_SHORT).show()
    }
    override fun onPause() {
        super.onPause()
        Toast.makeText(applicationContext, "onPause invoked", Toast.LENGTH_SHORT).show()
    }
    override fun onStop() {
        super.onStop()
        Toast.makeText(applicationContext, "onStop invoked", Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(applicationContext, "onRestart invoked", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(applicationContext, "onDestroy invoked", Toast.LENGTH_SHORT).show()
    }
}
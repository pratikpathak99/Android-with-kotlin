package com.pratik.mada_program

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()
    }

    fun program_one(view: View) {
        intent = Intent(applicationContext, Program_One::class.java)
        startActivity(intent)
    }

    fun program_six(view: View) {
        intent = Intent(applicationContext, Program_Six::class.java)
        startActivity(intent)
    }

    fun program_six_final(view: View) {
        Toast.makeText(applicationContext,"Click Event..", Toast.LENGTH_SHORT).show()
    }

    fun program_seven(view: View) {
        intent = Intent(applicationContext, Program_Seven::class.java)
        startActivity(intent)
    }

    fun program_eight(view: View) {
        Toast.makeText(applicationContext,"add 2 activities..", Toast.LENGTH_SHORT).show()
    }

    fun program_one_one(view: View) {
        Toast.makeText(applicationContext,"Installation Android Studio..", Toast.LENGTH_SHORT).show()
    }

    fun program_two(view: View) {
        Toast.makeText(applicationContext,"Running the AVD Manager..", Toast.LENGTH_SHORT).show()
    }

    fun program_three(view: View) {
        Toast.makeText(applicationContext,"Android Program in Physical Device..", Toast.LENGTH_SHORT).show()
    }
}
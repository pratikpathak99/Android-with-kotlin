package com.pratik.mada_program

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class program_two_part_three : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_program_two_part_three)
        supportActionBar?.hide()
    }

    fun shared_preference(view: View) {
        intent = Intent(applicationContext,shared_preference::class.java)
        startActivity(intent);
    }

    fun Internal_Storage(view: View) {
        intent = Intent(applicationContext,Internal_Storage::class.java)
        startActivity(intent);
    }
}
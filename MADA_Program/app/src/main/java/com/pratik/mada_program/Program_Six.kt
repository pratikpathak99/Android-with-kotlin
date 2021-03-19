package com.pratik.mada_program

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class Program_Six : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_program__six)

        supportActionBar?.hide()
    }

    fun make_Toast(view: View) {
        val editText = findViewById<EditText>(R.id.EditText_edit)
        Toast.makeText(applicationContext,editText.text,Toast.LENGTH_SHORT).show()
    }
}
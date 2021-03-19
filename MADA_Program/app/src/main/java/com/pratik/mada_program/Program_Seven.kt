package com.pratik.mada_program

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Program_Seven : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_program__seven)

        supportActionBar?.hide()
    }

    var count = 0

    fun count(view: View) {
        val count_textView = findViewById<TextView>(R.id.textView_count);
        ++count
        count_textView.text = count.toString()
    }
    fun toast(view: View) {
        val count_textView = findViewById<TextView>(R.id.textView_count);

        Toast.makeText(applicationContext,count_textView.text, Toast.LENGTH_SHORT).show()
    }
}
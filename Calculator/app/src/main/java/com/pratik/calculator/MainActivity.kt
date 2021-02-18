package com.pratik.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import android.widget.Toast.LENGTH_LONG

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Hide Action Bar
        supportActionBar?.hide()
    }



    val ans = null ;

    fun Button_on(v: View) {

        //declare variable in kotlin
        val num = "1"
        var s = ""

        //accessing our textview from layout
        val textView = findViewById<TextView>(R.id.TextView_Ans).apply {
            text=num
            var ans: Int = "1".toInt()
             s = ans.toString()
        }

        //Toast syntax
        Toast.makeText(this@MainActivity, s , Toast.LENGTH_SHORT).show()
    }
    fun Button_two(view: View) {
        //declare variable in kotlin
        val num = "2"

        //accessing our textview from layout
        val textView = findViewById<TextView>(R.id.TextView_Ans).apply {
            text=num
        }
    }
    fun Button_three(view: View) {
        //declare variable in kotlin
        val num = "3"

        //accessing our textview from layout
        val textView = findViewById<TextView>(R.id.TextView_Ans).apply {
            text=num
        }
    }
    fun Button_four(view: View) {
        //declare variable in kotlin
        val num = "4"

        //accessing our textview from layout
        val textView = findViewById<TextView>(R.id.TextView_Ans).apply {
            text=num
        }
    }
    fun Button_five(view: View) {
        //declare variable in kotlin
        val num = "5"

        //accessing our textview from layout
        val textView = findViewById<TextView>(R.id.TextView_Ans).apply {
            text=num
        }
    }
    fun Button_six(view: View) {
        //declare variable in kotlin
        val num = "6"

        //accessing our textview from layout
        val textView = findViewById<TextView>(R.id.TextView_Ans).apply {
            text=num
        }
    }
    fun Button_seven(view: View) {
        //declare variable in kotlin
        val num = "7"

        //accessing our textview from layout
        val textView = findViewById<TextView>(R.id.TextView_Ans).apply {
            text=num
        }
    }
    fun Button_eight(view: View) {
        //declare variable in kotlin
        val num = "8"

        //accessing our textview from layout
        val textView = findViewById<TextView>(R.id.TextView_Ans).apply {
            text=num
        }
    }
    fun Button_nine(view: View) {
        //declare variable in kotlin
        val num = "9"

        //accessing our textview from layout
        val textView = findViewById<TextView>(R.id.TextView_Ans).apply {
            text=num
        }
    }
    fun Button_zero(view: View) {//declare variable in kotlin
        val num = "0"

        //accessing our textview from layout
        val textView = findViewById<TextView>(R.id.TextView_Ans).apply {
            text=num
        }}
}
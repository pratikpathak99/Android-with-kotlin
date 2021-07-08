package com.pratik.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class Home_Page : AppCompatActivity() {

    var ans:String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home__page)

        supportActionBar!!.hide()

        val textView = findViewById(R.id.textView1) as TextView

        //textView.text="Testing.."

        val progressBar = findViewById<ProgressBar>(R.id.progressBar)


    }



    fun Ans_a(view: View) {
        ans="a"
    }
    fun Ans_b(view: View) {
        ans="b"
    }
    fun Ans_c(view: View) {
        ans="c"
    }
    fun Ans_d(view: View) {
        ans="d"
    }

    fun check_ans(view: View){
        if(ans==""){
            Toast.makeText(applicationContext,"Select any Ans.", Toast.LENGTH_SHORT).show()
        }else{
            Toast.makeText(applicationContext,ans, Toast.LENGTH_SHORT).show()
        }

    }
}
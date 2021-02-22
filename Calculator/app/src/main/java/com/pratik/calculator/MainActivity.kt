package com.pratik.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import android.widget.Toast.LENGTH_LONG

class MainActivity : AppCompatActivity() {

    lateinit var textView: TextView
    lateinit var finalAns : TextView
    lateinit var plus: Button
    lateinit var Button_neg : Button
    lateinit var Button_sub : Button
    lateinit var Button_div : Button
    lateinit var Button_total : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.TextView_Ans)
        plus = findViewById(R.id.plus)
        Button_neg = findViewById(R.id.button_neg)
        Button_sub = findViewById(R.id.button_sub)
        Button_div = findViewById(R.id.button_div)
        finalAns = findViewById(R.id.TextView_finalAns)
        Button_total = findViewById(R.id.Button_total)

        Button_total.setVisibility(View.GONE);

        // Hide Action Bar
        supportActionBar?.hide()
    }

    val ans = "" ;
    var st = ""
    var testans = "";

    fun Button_on(v: View) {

        //declare variable in kotlin
        val num = "1"


        //accessing our textview from layout
        val textView = findViewById<TextView>(R.id.TextView_Ans).apply {
            //set TextView Value
            //text=num
            var ans: Int = "1".toInt()

            //Type Convert Int To String
             st = ans.toString()
            testans = "$testans$ans"
            text= testans

        }
        //Toast.makeText(this@MainActivity, test , Toast.LENGTH_SHORT).show()
    }
    fun Button_two(view: View) {
        //declare variable in kotlin
        val num = "2"

        //accessing our textview from layout
        val textView = findViewById<TextView>(R.id.TextView_Ans).apply {

            var ans: Int = "2".toInt()

            //Type Convert Int To String
            st = ans.toString()
            testans = "$testans$ans"
            text= testans
        }
    }
    fun Button_three(view: View) {
        //declare variable in kotlin
        val num = "3"

        //accessing our textview from layout
        val textView = findViewById<TextView>(R.id.TextView_Ans).apply {
            text=num
            var ans: Int = "3".toInt()

            //Type Convert Int To String
            st = ans.toString()

            testans = "$testans$ans"
            text= testans
        }
    }
    fun Button_four(view: View) {
        //declare variable in kotlin
        val num = "4"

        //accessing our textview from layout
        val textView = findViewById<TextView>(R.id.TextView_Ans).apply {
            text=num
            var ans: Int = "4".toInt()

            //Type Convert Int To String
            st = ans.toString()

            testans = "$testans$ans"
            text= testans
        }
    }
    fun Button_five(view: View) {
        //declare variable in kotlin
        val num = "5"

        //accessing our textview from layout
        val textView = findViewById<TextView>(R.id.TextView_Ans).apply {
            text=num
            var ans: Int = "5".toInt()

            //Type Convert Int To String
            st = ans.toString()
            testans = "$testans$ans"
            text= testans
        }
    }
    fun Button_six(view: View) {
        //declare variable in kotlin
        val num = "6"

        //accessing our textview from layout
        val textView = findViewById<TextView>(R.id.TextView_Ans).apply {
            text=num
            var ans: Int = "6".toInt()
            //Type Convert Int To String
            st = ans.toString()
            testans = "$testans$ans"
            text= testans
        }
    }
    fun Button_seven(view: View) {
        //declare variable in kotlin
        val num = "7"

        //accessing our textview from layout
        val textView = findViewById<TextView>(R.id.TextView_Ans).apply {
            text=num
            var ans: Int = "7".toInt()
            //Type Convert Int To String
            st = ans.toString()
            testans = "$testans$ans"
            text= testans
        }
    }
    fun Button_eight(view: View) {
        //declare variable in kotlin
        val num = "8"

        //accessing our textview from layout
        val textView = findViewById<TextView>(R.id.TextView_Ans).apply {
            text=num
            var ans: Int = "8".toInt()

            //Type Convert Int To String
            st = ans.toString()
            testans = "$testans$ans"
            text= testans
        }
    }
    fun Button_nine(view: View) {
        //declare variable in kotlin
        val num = "9"


        //accessing our textview from layout
        val textView = findViewById<TextView>(R.id.TextView_Ans).apply {
            text=num
            var ans: Int = "9".toInt()

            //Type Convert Int To String
            st = ans.toString()
            testans = "$testans$ans"
            text= testans
        }
    }
    fun Button_zero(view: View) {
        //declare variable in kotlin
        val num = "0"

        //accessing our textview from layout
        val textView = findViewById<TextView>(R.id.TextView_Ans).apply {
            text=num
            var ans: Int = "0".toInt()

            //Type Convert Int To String
            st = ans.toString()
            testans = "$testans$ans"
            text= testans
        }
    }
    var symbol:String = ""
    fun button_plue(view: View) {
        val ansone = textView.text.toString()
        if(ansone==""){
            Toast.makeText(this@MainActivity, "Please Enter Some Value" , Toast.LENGTH_SHORT).show()
        }
        else{
            Toast.makeText(this@MainActivity, ansone , Toast.LENGTH_SHORT).show()
            textView.setText("");
            plus.setVisibility(View.GONE);
            Button_neg.setVisibility(View.GONE);
            Button_sub.setVisibility(View.GONE);
            Button_div.setVisibility(View.GONE);
            finalAns.setText("Answer :- "+ansone+" + ")
            symbol = "+"
            Button_total.setVisibility(View.VISIBLE);
        }
    }

    fun Button_neg(view: View) {
        val ansone = textView.text.toString()
        if(ansone==""){
            Toast.makeText(this@MainActivity, "Please Enter Some Value" , Toast.LENGTH_SHORT).show()
        }
        else{
            Toast.makeText(this@MainActivity, ansone , Toast.LENGTH_SHORT).show()
            textView.setText("");

            plus.setVisibility(View.GONE);
            Button_neg.setVisibility(View.GONE);
            Button_sub.setVisibility(View.GONE);
            Button_div.setVisibility(View.GONE);
            finalAns.setText("Answer :- "+ansone+" - ")
            symbol = "-"
            Button_total.setVisibility(View.VISIBLE);
        }

    }
    fun Button_sub(view: View) {
        val ansone = textView.text.toString()
        if(ansone==""){
            Toast.makeText(this@MainActivity, "Please Enter Some Value" , Toast.LENGTH_SHORT).show()
        }
        else{
            Toast.makeText(this@MainActivity, ansone , Toast.LENGTH_SHORT).show()
            textView.setText("");
            plus.setVisibility(View.GONE);
            Button_neg.setVisibility(View.GONE);
            Button_sub.setVisibility(View.GONE);
            Button_div.setVisibility(View.GONE);
            finalAns.setText("Answer :- "+ansone+" * ")
            symbol = "*"
            Button_total.setVisibility(View.VISIBLE);
        }

    }
    fun Button_div(view: View) {
        val ansone = textView.text.toString()
        if(ansone==""){
            Toast.makeText(this@MainActivity, "Please Enter Some Value" , Toast.LENGTH_SHORT).show()
        }
        else{
            Toast.makeText(this@MainActivity, ansone , Toast.LENGTH_SHORT).show()
            textView.setText("");
            plus.setVisibility(View.GONE);
            Button_neg.setVisibility(View.GONE);
            Button_sub.setVisibility(View.GONE);
            Button_div.setVisibility(View.GONE);
            finalAns.setText("Answer :- "+ansone+" / ")
            symbol = "/"
            Button_total.setVisibility(View.VISIBLE);
        }

    }

    fun total(view: View) {
        Toast.makeText(this@MainActivity, symbol , Toast.LENGTH_SHORT).show()
    }
}
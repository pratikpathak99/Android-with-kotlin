package com.pratik.mada_program

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Switch

class program_thirteen : AppCompatActivity() {
    
    lateinit var button : Button
    lateinit var buttonSwitch: Switch
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_program_thirteen)

        supportActionBar?.hide()
        
        button=findViewById(R.id.button)
        buttonSwitch = findViewById(R.id.buttonSwitch)

        button.setOnClickListener {
            button.isSelected != button.isSelected
        }

        buttonSwitch.setOnCheckedChangeListener { buttonView, isChecked ->
            button.isEnabled = isChecked
        }
    }
}
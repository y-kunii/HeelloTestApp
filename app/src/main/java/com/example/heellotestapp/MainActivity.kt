package com.example.heellotestapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calcButton : Button = findViewById(R.id.button1)
        calcButton.setOnClickListener {
            val inputText1 : TextView = findViewById(R.id.inputText1)
            val inputText2 : TextView = findViewById(R.id.inputText2)
            val num1: Int = inputText1.getText().toString().toInt()
            val num2: Int = inputText2.getText().toString().toInt()
            val outputText1 : TextView = findViewById(R.id.outputText1)
            val outputText2 : TextView = findViewById(R.id.outputText2)
            outputText1.setText((num1 / num2).toString())
            outputText2.setText((num1 % num2).toString())
        }
    }
}

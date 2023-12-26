package com.example.cal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val display = findViewById(R.id.textView2) as TextView
        val BT1 = findViewById(R.id.BT1) as Button
        val BT2 = findViewById(R.id.BT2) as Button
        val button3 = findViewById(R.id.button3) as Button
        val button4 = findViewById(R.id.button4) as Button
        val button5 = findViewById(R.id.button5) as Button
        val button6 = findViewById(R.id.button6) as Button
        val button7 = findViewById(R.id.button7) as Button
        val button8 = findViewById(R.id.button8) as Button
        val button9 = findViewById(R.id.button9) as Button
        val button10 = findViewById(R.id.button10) as Button
        val button11 = findViewById(R.id.button11) as Button
        val button12 = findViewById(R.id.button12) as Button
        val button13 = findViewById(R.id.button13) as Button
        val button14 = findViewById(R.id.button14) as Button
        val button15 = findViewById(R.id.button15) as Button


        BT1.setOnClickListener(){
            display.setText("1")
        }
        BT2.setOnClickListener(){
            display.setText("2")
        }

        button3.setOnClickListener(){
            display.setText("+")
        }
        button4.setOnClickListener(){
            display.setText("3")
        }
        button5.setOnClickListener(){
            display.setText("4")
        }
        button6.setOnClickListener(){
            display.setText("-")
        }
        button7.setOnClickListener(){
            display.setText("5")
        }
        button8.setOnClickListener(){
            display.setText("6")
        }
        button9.setOnClickListener(){
            display.setText("*")
        }
        button10.setOnClickListener(){
            display.setText("7")
        }
        button11.setOnClickListener(){
            display.setText("8")
        }
        button12.setOnClickListener(){
            display.setText("/")
        }
        button13.setOnClickListener(){
            display.setText("9")
        }
        button14.setOnClickListener(){
            display.setText("0")
        }
        button15.setOnClickListener(){
            display.setText("=")
        }
    }
}
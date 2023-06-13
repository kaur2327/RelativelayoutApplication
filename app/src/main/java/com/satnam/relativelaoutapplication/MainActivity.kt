package com.satnam.relativelaoutapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var btnMinus : Button
    lateinit var btnSub : Button
    lateinit var btnAdd : Button
    lateinit var btnDiv : Button
    lateinit var tvNumber : TextView
    var number = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnMinus = findViewById(R.id.btnMinus)
        btnSub = findViewById(R.id.btnSub)
        btnAdd = findViewById(R.id.btnAdd)
        btnDiv = findViewById(R.id.btnDiv)
        tvNumber = findViewById(R.id.tvNumber)

        tvNumber.text = number.toString()

        btnAdd.setOnClickListener{
            number += 2
            tvNumber.text = number.toString()
        }
        btnMinus.setOnClickListener {
            number -= 2
            tvNumber.text = number.toString()
        }
        btnDiv.setOnClickListener {
            number *= 2
            tvNumber.text = number.toString()
        }
        btnSub.setOnClickListener {
            number %= 2
            tvNumber.text = number.toString()
        }
    }
}
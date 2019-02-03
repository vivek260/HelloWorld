package com.example.kotlinhelloworld

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        changeText()
    }

    fun changeText() {
        btnSayHello.setOnClickListener {
            iblText.setText("Hello World")
        }
    }
}
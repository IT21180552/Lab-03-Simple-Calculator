package com.example.simplecalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class activity_display : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)


        var txtAnswer = findViewById<TextView>(R.id.txtAnswer)
        txtAnswer.setText(intent.getDoubleExtra("answer",0.0).toString())
        var btnBack = findViewById<Button>(R.id.btn_back)
        btnBack.setOnClickListener {
            var intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}
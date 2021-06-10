package com.example.picturebookapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnNext:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castView()
        clickNext()
    }
    fun castView(){
        btnNext=findViewById(R.id.btnNext)
    }
    fun clickNext(){
        btnNext.setOnClickListener {
            val intent=Intent(baseContext,NyatitiActivity::class.java)
            startActivity(intent)
        }
    }


}
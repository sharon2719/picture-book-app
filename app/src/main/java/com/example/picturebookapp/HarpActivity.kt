package com.example.picturebookapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HarpActivity : AppCompatActivity() {
    lateinit var btnPrev3:Button
    lateinit var btnNext3:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_harp)
        castView3()
        clickButtons3()
    }
    fun castView3(){
        btnPrev3=findViewById(R.id.btnPrev3)
        btnNext3=findViewById(R.id.btnNext3)

    }
    fun clickButtons3(){
        btnPrev3.setOnClickListener {
            val previous3= Intent(baseContext,NyatitiActivity::class.java)
            startActivity(previous3)
        }
        btnNext3.setOnClickListener {
            val next3= Intent(baseContext,BassActivity::class.java)
            startActivity(next3)
        }
    }
}
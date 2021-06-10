package com.example.picturebookapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class NyatitiActivity : AppCompatActivity() {


    lateinit var btnPrev:Button
    lateinit var btnNext2:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nyatiti)
        castView2()
        clickButtons2()
    }
    fun castView2(){
        btnPrev=findViewById(R.id.btnPrev)
        btnNext2=findViewById(R.id.btnNext2)

    }
    fun clickButtons2(){
    btnPrev.setOnClickListener {
        val prev=Intent(baseContext,MainActivity::class.java)
        startActivity(prev)
    }
    btnNext2.setOnClickListener {
        val next2=Intent(baseContext,HarpActivity::class.java)
        startActivity(next2)
    }

    }
}
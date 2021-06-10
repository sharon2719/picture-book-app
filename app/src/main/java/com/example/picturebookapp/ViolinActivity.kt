package com.example.picturebookapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ViolinActivity : AppCompatActivity() {

    lateinit var btnPrev5:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_violin)
        castView5()
        clickButtons5()
    }
    fun castView5(){

        btnPrev5=findViewById(R.id.btnPrev5)
    }
    fun clickButtons5(){
        btnPrev5.setOnClickListener {
            val prev5=Intent(baseContext,BassActivity::class.java)
            startActivity(prev5)
        }
    }
    }

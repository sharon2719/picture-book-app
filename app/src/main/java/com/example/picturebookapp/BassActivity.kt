package com.example.picturebookapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class BassActivity : AppCompatActivity() {
    lateinit var btnPrev4:Button
    lateinit var btnNext4:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bass)
        castView4()
        clickButtons4()
    }


fun castView4(){
    btnPrev4=findViewById(R.id.btnPrev4)
    btnNext4=findViewById(R.id.btnNext4)
}

fun clickButtons4(){
    btnPrev4.setOnClickListener {
        val previous4= Intent(baseContext,HarpActivity::class.java)
        startActivity(previous4)
    }
    btnNext4.setOnClickListener {
        val next4= Intent(baseContext,ViolinActivity::class.java)
        startActivity(next4)
    }
}
}

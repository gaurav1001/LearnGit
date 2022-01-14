package com.example.learngit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.v(Tag,"Hello World")
        val msg = findViewById<TextView>(R.id.msg)
        msg.text = "Latest change"
    }
    companion object{
        const val Tag = "TAG"
    }
}
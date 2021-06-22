package com.onovughe.todoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text




class HomeActivity2 : AppCompatActivity() {
    private  lateinit var welcome1: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home2)

        //Finding Value by Id
        welcome1 = findViewById(R.id.welcome1)

        welcome1.text = "Welcome Akpor"
    }
}
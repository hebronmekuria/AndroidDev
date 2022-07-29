package com.example.testapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonTop=findViewById<Button>(R.id.buttonTop)
        val buttonBottom=findViewById<Button>(R.id.buttonBottom)
        buttonTop.setOnClickListener {

            Toast.makeText(this,"Burger or Pizza?", Toast.LENGTH_SHORT).show()

        }
        buttonBottom.setOnClickListener {

            Toast.makeText(this, "Soda or water?", Toast.LENGTH_SHORT).show()

        }


    }
}
package com.example.onlinevotingprj

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val enter = findViewById<Button>(R.id.welcom_btn)

            enter.setOnClickListener{
                 val intent = Intent(this,Login::class.java)
                startActivity(intent)
            }
    }
}
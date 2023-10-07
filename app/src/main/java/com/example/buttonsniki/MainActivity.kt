package com.example.buttonsniki

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn1 = findViewById<MaterialButton>(R.id.btnGoToButton)

        btn1.setOnClickListener {
            startActivity(
                Intent(this, ButtonActivity::class.java))
        }
    }

}


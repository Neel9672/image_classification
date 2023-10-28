package com.example.imageclassification

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.mlkit.vision.text.TextRecognition

class LauncherActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launcher)

        val txtRecognition: Button =findViewById(R.id.txtRecognition)
        val imgRecognition:Button= findViewById(R.id.imgRecognition)

        txtRecognition.setOnClickListener{
            val intent= Intent(this, TextRecognize::class.java)
            startActivity(intent)

        }

        imgRecognition.setOnClickListener{
            val intent=Intent(this, MainActivity::class.java)
            startActivity(intent)

        }
    }
}
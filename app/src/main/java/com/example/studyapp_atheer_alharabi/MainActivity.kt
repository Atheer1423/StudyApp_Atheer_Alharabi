package com.example.studyapp_atheer_alharabi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bKotlin.setOnClickListener {
            val int = Intent(this, Kotlin::class.java)

            startActivity(int)
        }
        bAndroid.setOnClickListener {
            val int = Intent(this, Android::class.java)

            startActivity(int)
        }

    }
}
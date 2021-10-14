package com.example.studyapp_atheer_alharabi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_android.*

class Android : AppCompatActivity() {
    lateinit var arrayAndroid: ArrayList<review>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android)
        arrayAndroid = arrayListOf(
            review(
                "Project setup",
                "setting up an Android Studio Project",
                "U element",
                "Details note here"
            ),
            review("Console", "Printing to the console", "Ui element", "Details note here"),
            review(
                "Ui Element",
                "Creating,modifying and initializing UI Element",
                "Ui element",
                "Details note here"
            ),

            )
        rvAndroid.adapter = adapter(this, arrayAndroid)
        rvAndroid.layoutManager = LinearLayoutManager(this)
    }
}
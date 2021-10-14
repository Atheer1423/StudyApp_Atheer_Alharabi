package com.example.studyapp_atheer_alharabi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_android.*
import kotlinx.android.synthetic.main.activity_kotlin.*

class Kotlin : AppCompatActivity() {

    lateinit var arrayKotlin:ArrayList<review>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)
        arrayKotlin = arrayListOf(
            review("val and var", "Declaring varibales", "U element", "Details note here"),
            review("User Input", "Getting user input", "Ui element", "Details note here"),
            review("Strings", "String concatation", "Ui element", "Details note here"),
            review("Data types", "Understanding data types", "Ui element", "Details note here"),
            review(
                "Basic Operations",
                "Performing math operation in kotlin",
                "Ui element",
                "Details note here"
            ),
            review("if statement", "decision making statement", "Ui element", "Details note here"),

            )
        rvKotlin.adapter = adapter(this, arrayKotlin)
        rvKotlin.layoutManager = LinearLayoutManager(this)




    }}
        

    

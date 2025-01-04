package com.example.firstapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var textTitle: TextView
    private lateinit var textInput: EditText
    private lateinit var buttonInput: Button
    private lateinit var textOutput: TextView
    private lateinit var countSymbol: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textTitle = findViewById(R.id.textTitle)
        textInput = findViewById(R.id.textInput)
        buttonInput = findViewById(R.id.buttonInput)
        textOutput = findViewById(R.id.textOutput)
        countSymbol = findViewById(R.id.countSymbol)
        onButtonClick(buttonInput)
    }


    fun onButtonClick(view: View) {

        val sendText = textInput.text.toString()
        textOutput.text = sendText.reversed()
        val count = sendText.filter { it != ' ' }.length
        countSymbol.text = "Количество символов:$count"

    }


}
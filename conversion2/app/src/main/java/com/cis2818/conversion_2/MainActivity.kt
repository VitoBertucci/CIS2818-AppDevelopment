package com.cis2818.conversion_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun convert(view : View) {
        val dollarText = findViewById<EditText>(R.id.dollarText)
        val output = findViewById<TextView>(R.id.output)
        if(dollarText.text.isNotEmpty()) {
            val dollarValue = dollarText.text.toString().toFloat()
            val euroValue = dollarValue * 0.85f
            output.text = euroValue.toString()
        } else {
            output.text = getString(R.string.output_no_value)
        }
    }
}
package com.example.aboutme2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.aboutme2.R
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnDone : Button = findViewById(R.id.done_button)
        btnDone.setOnClickListener(){
            val tvInput :TextView = findViewById(R.id.nickname_edit)
            val tvResult :TextView = findViewById(R.id.tvResult)
            tvResult.text = tvInput.text
            tvResult.visibility = View.VISIBLE
            btnDone.visibility = View.GONE
            tvInput.visibility = View.GONE
        }
    }
}
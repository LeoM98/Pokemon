package com.example.pokemon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main5.*
import kotlinx.android.synthetic.main.activity_main6.*

class Main6Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)

        btA1.setOnClickListener {

            val intent: Intent = Intent(this,Main5Activity::class.java)
            startActivity(intent)

        }

        azul.setOnClickListener {

            val intent: Intent = Intent(this,Main7Activity::class.java)
            startActivity(intent)

        }
    }
}

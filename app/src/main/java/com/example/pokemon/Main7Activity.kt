package com.example.pokemon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main6.*
import kotlinx.android.synthetic.main.activity_main7.*

class Main7Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7)

        back.setOnClickListener {

            val intent: Intent = Intent(this,Main6Activity::class.java)
            startActivity(intent)

        }

        vamos.setOnClickListener {

            val intent: Intent = Intent(this,Main8Activity::class.java)
            startActivity(intent)

        }
    }
}

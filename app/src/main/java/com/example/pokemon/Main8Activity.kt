package com.example.pokemon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main7.back
import kotlinx.android.synthetic.main.activity_main8.*

class Main8Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main8)

        back.setOnClickListener {

            val intent: Intent = Intent(this,Main7Activity::class.java)
            startActivity(intent)

        }

        textView4.setOnClickListener {

            val intent: Intent = Intent(this,Main9Activity::class.java)
            startActivity(intent)

        }
    }
}

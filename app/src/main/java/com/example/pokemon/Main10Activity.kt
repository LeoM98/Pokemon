package com.example.pokemon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main10.*
import kotlinx.android.synthetic.main.activity_main7.*

class Main10Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main10)

        atras.setOnClickListener {

            val intent: Intent = Intent(this,Main3Activity::class.java)
            startActivity(intent)

        }

        finish.setOnClickListener {

            val intent: Intent = Intent(this,Main11Activity::class.java)
            startActivity(intent)

        }
    }
}

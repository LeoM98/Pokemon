package com.example.pokemon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn.setOnClickListener {

            val intent: Intent = Intent(this,Main2Activity::class.java)
            startActivity(intent)

        }

        btn2.setOnClickListener {

            val intent: Intent = Intent(this,Main3Activity::class.java)
            startActivity(intent)

        }

    }
}

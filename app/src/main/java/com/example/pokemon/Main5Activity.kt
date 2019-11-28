package com.example.pokemon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main4.*
import kotlinx.android.synthetic.main.activity_main5.*

class Main5Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        back.setOnClickListener {

            val intent: Intent = Intent(this,Main4Activity::class.java)
            startActivity(intent)

        }

        vamos.setOnClickListener {

            val intent: Intent = Intent(this,Main6Activity::class.java)
            startActivity(intent)

        }
    }
}

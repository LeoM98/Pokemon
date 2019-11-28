package com.example.pokemon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main7.*
import kotlinx.android.synthetic.main.activity_main7.back
import kotlinx.android.synthetic.main.activity_main9.*

class Main9Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main9)

        back.setOnClickListener {

            val intent: Intent = Intent(this,Main8Activity::class.java)
            startActivity(intent)

        }

        imageView10.setOnClickListener {

            val intent: Intent = Intent(this,Main10Activity::class.java)
            startActivity(intent)

        }
    }
}

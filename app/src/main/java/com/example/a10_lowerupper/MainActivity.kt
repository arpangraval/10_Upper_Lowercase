package com.example.a10_lowerupper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        upperlowerBTN.setOnClickListener {
            anslowerTV.text = nameET.text.toString().toLowerCase()
            ansupperTV.text = nameET.text.toString().toUpperCase()


        }
    }
}
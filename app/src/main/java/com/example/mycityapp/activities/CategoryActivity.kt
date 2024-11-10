package com.example.mycityapp.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.final2mycityapp.R

class CategoryActivity : AppCompatActivity() {
//    private lateinit var button1: Button
    private lateinit var button2: Button
    private lateinit var button3: Button
    private lateinit var button4: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.category)

//        button1 = findViewById(R.id.button1) // Shopping Center
        button2 = findViewById(R.id.button2) // Restaurant
        button3 = findViewById(R.id.button3) // Friendly Parks
        button4 = findViewById(R.id.button4) // Coffee Shop

//        button1.setOnClickListener {
//            startActivity(Intent(this, ShoppingCentersActivity::class.java))
//        }

        button2.setOnClickListener {
            startActivity(Intent(this, RestaurantsActivity::class.java))
        }

        button3.setOnClickListener {
            startActivity(Intent(this, ParksActivity::class.java))
        }

        button4.setOnClickListener {
            startActivity(Intent(this, CoffeeShopsActivity::class.java))
        }
    }
}

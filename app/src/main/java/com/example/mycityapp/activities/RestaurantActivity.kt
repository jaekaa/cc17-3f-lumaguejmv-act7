package com.example.mycityapp.activities

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.final2mycityapp.R
import com.example.final2mycityapp.viewmodels.RestaurantsViewModel

class RestaurantsActivity : AppCompatActivity() {
    private lateinit var viewModel: RestaurantsViewModel
    private lateinit var textViewRestaurants: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restaurants)

        // Initialize the TextView
        textViewRestaurants = findViewById(R.id.textViewRestaurants)

        // Initialize the ViewModel
        viewModel = ViewModelProvider(this).get(RestaurantsViewModel::class.java)

        // Observe the LiveData
        viewModel.restaurants.observe(this, Observer { restaurantList ->
            // Update the UI with the list of restaurants
            val builder = StringBuilder()
            restaurantList?.forEach { restaurant ->
                builder.append(restaurant).append("\n")
            }
            textViewRestaurants.text = builder.toString()
        })
    }
}

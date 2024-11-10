package com.example.final2mycityapp

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize Navigation Host and Controller
        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController

        // Set up Explore button to navigate to categoryFragment
        val exploreButton: Button = findViewById(R.id.baguio_button)
        exploreButton.setOnClickListener {
            navController.navigate(R.id.categoryFragment)
        }
    }
}

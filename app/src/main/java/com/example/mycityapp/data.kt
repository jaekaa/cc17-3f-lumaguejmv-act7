package com.example.mycityapp

// Data class for Recommendations
data class Recommendation(
    val name: String,
    val description: String
)

// Data class for Coffee Shops
data class CoffeeShop(
    val name: String,
    val description: String,
    val imageResId: Int
)

data class Park(
    val name: String,
    val description: String,
    val imageResourceId: Int
)

data class Restaurant(
    val name: String,
    val description: String,
    val imageResourceId: Int
)


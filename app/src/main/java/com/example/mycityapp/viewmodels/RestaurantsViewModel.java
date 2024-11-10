package com.example.mycityapp.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.final2mycityapp.R;
import com.example.final2mycityapp.Restaurant;

import java.util.ArrayList;
import java.util.List;

public class RestaurantsViewModel extends ViewModel {
    private final MutableLiveData<List<Restaurant>> restaurants;

    public RestaurantsViewModel() {
        restaurants = new MutableLiveData<>();
        loadRestaurants();
    }

    private void loadRestaurants() {
        List<Restaurant> restaurantList = new ArrayList<>();

        restaurantList.add(new Restaurant("The Manor Café",
                "Located in Camp John Hay, offering a cozy atmosphere and a selection of international dishes.",
                R.drawable.the_manor_cafe));

        restaurantList.add(new Restaurant("Lemon and Olives",
                "A Mediterranean restaurant serving authentic Greek and Mediterranean cuisine with fresh ingredients.",
                R.drawable.lemon_and_olives));

        restaurantList.add(new Restaurant("The Filling Station",
                "A retro-themed American diner offering hearty meals and comfort food.",
                R.drawable.filling_station));

        restaurants.setValue(restaurantList);
    }

    public LiveData<List<Restaurant>> getRestaurants() {
        return restaurants;
    }
}

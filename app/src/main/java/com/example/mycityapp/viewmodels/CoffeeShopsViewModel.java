package com.example.mycityapp.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.final2mycityapp.CoffeeShop;
import com.example.final2mycityapp.R;
import com.example.final2mycityapp.viewmodels.CoffeeShopsViewModel;

import java.util.ArrayList;
import java.util.List;

public class CoffeeShopsViewModel extends ViewModel {
    private final MutableLiveData<List<CoffeeShop>> coffeeShops = new MutableLiveData<>();

    public CoffeeShopsViewModel() {
        loadCoffeeShops();
    }

    public LiveData<List<CoffeeShop>> getCoffeeShops() {
        return coffeeShops;
    }

    private void loadCoffeeShops() {
        List<CoffeeShop> coffeeShopList = new ArrayList<>();
        coffeeShopList.add(new CoffeeShop("The Coffee Library", "A cozy space with a variety of coffee choices, perfect for book lovers.", R.drawable.coffee_library));
        coffeeShopList.add(new CoffeeShop("Beans & Mugs", "A coffee shop and gaming hub offering great coffee and a chill atmosphere.", R.drawable.beans_and_mugs));
        coffeeShopList.add(new CoffeeShop("Cafe Yagam", "A hidden gem with specialty coffee blends and a peaceful atmosphere.", R.drawable.cafe_yagam));

    }
}

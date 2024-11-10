package com.example.mycityapp.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.final2mycityapp.Park;
import com.example.final2mycityapp.R;

import java.util.ArrayList;
import java.util.List;

public class ParksViewModel extends ViewModel {
    private final MutableLiveData<List<Park>> parks;

    public ParksViewModel() {
        parks = new MutableLiveData<>();
        loadParks();
    }

    private void loadParks() {
        List<Park> parkList = new ArrayList<>();

        parkList.add(new Park("Mines View Park",
                "A popular viewpoint offering a panoramic view of the mining town of Itogon and the surrounding mountains. Known for its souvenir shops.",
                R.drawable.mines_view_park));

        parkList.add(new Park("Burnham Park",
                "A renowned park in Baguio known for its scenic lake, boating, and lush gardens. It’s a perfect spot for picnics and relaxation.",
                R.drawable.burnham_park));

        parkList.add(new Park("Wright Park",
                "Famous for its horseback riding activities and scenic rides along the park’s pathway.",
                R.drawable.wright_park));

        parks.setValue(parkList);
    }

    public LiveData<List<Park>> getParks() {
        return parks;
    }
}

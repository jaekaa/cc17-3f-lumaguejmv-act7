package com.example.mycityapp.activities;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.final2mycityapp.Park;
import com.example.final2mycityapp.R;
import com.example.final2mycityapp.viewmodels.ParksViewModel;

import java.util.List;

public class ParksActivity extends AppCompatActivity {
    private ParksViewModel viewModel;
    private TextView textViewParks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parks);

        textViewParks = findViewById(R.id.textViewParks); // Ensure you have this TextView in your layout

        viewModel = new ViewModelProvider(this).get(ParksViewModel.class);
        viewModel.getParks().observe(this, new Observer<List<Park>>() {
            @Override
            public void onChanged(List<Park> parkList) {
                // Update UI with the list of parks
                StringBuilder builder = new StringBuilder();
                for (Park park : parkList) {
                    builder.append(park.getName()).append(": ").append(park.getDescription()).append("\n");
                }
                textViewParks.setText(builder.toString());
            }
        });
    }
}


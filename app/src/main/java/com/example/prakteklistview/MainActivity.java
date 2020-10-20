package com.example.prakteklistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private String[] movie = {"Bad Boys for Life", "The Old Guard", "Raised by Wolves", "Elite",
            "The Walking Dead: World Beyond", "Artemis Fowl", "Black Box",
            "Riverdale", "Law & Order: Special Victims Unit", "Scary Movie 5",
            "Star Trek: Discovery", "Hubie Halloween", "District 9", "The Hurricane Heist",
            "Paddington 2", "Pride & Prejudice "};

    private ListView lv_movie;
    private ArrayAdapter<String> movieAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        movieAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, movie);

        lv_movie = findViewById(R.id.lv_movie);
        lv_movie.setAdapter(movieAdapter);

    }
}
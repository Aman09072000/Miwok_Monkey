package com.example.miwoklanguageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Locale;

public class Numbers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<Object> words = new ArrayList<Object>();
        words.add(new Object("one", "lutti",R.drawable.number_one));
        words.add(new Object("two", "otiiko",R.drawable.number_two));
        words.add(new Object("three", "tolookosu",R.drawable.number_three));
        words.add(new Object("four", "oyyisa",R.drawable.number_four));
        words.add(new Object("five", "massokka",R.drawable.number_five));
        words.add(new Object("six", "temmokka",R.drawable.number_six));
        words.add(new Object("seven", "kenekaku",R.drawable.number_seven));
        words.add(new Object("eight", "kawinta",R.drawable.number_eight));
        words.add(new Object("nine", "wo’e",R.drawable.number_nine));
        words.add(new Object("ten", "na’aacha",R.drawable.number_ten));



        WordAdapter itemsAdapter = new WordAdapter(this, words,R.color.green_light);
        ListView listView = (ListView) findViewById(R.id.list_View);
        listView.setAdapter(itemsAdapter);
    }
}
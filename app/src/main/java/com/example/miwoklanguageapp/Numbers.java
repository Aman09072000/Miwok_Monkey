package com.example.miwoklanguageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Locale;

public class Numbers extends AppCompatActivity {
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        final ArrayList<Object> words = new ArrayList<Object>();
        words.add(new Object("one", "lutti", R.drawable.number_one,R.raw.number_one));
        words.add(new Object("two", "otiiko", R.drawable.number_two,R.raw.number_two));
        words.add(new Object("three", "tolookosu", R.drawable.number_three,R.raw.number_three));
        words.add(new Object("four", "oyyisa", R.drawable.number_four,R.raw.number_four));
        words.add(new Object("five", "massokka", R.drawable.number_five,R.raw.number_five));
        words.add(new Object("six", "temmokka", R.drawable.number_six,R.raw.number_six));
        words.add(new Object("seven", "kenekaku", R.drawable.number_seven,R.raw.number_seven));
        words.add(new Object("eight", "kawinta", R.drawable.number_eight,R.raw.number_eight));
        words.add(new Object("nine", "wo’e", R.drawable.number_nine,R.raw.number_nine));
        words.add(new Object("ten", "na’aacha", R.drawable.number_ten,R.raw.number_ten));


        WordAdapter itemsAdapter = new WordAdapter(this, words, R.color.green_light);
        ListView listView = (ListView) findViewById(R.id.list_View);
        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Object word = words.get(position);
            mediaPlayer = MediaPlayer.create(Numbers.this,word.getmAudiofile());
            mediaPlayer.start();
            }

        });
    }
}
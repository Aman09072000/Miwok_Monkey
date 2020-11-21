package com.example.miwoklanguageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Colors extends AppCompatActivity {
    private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        ArrayList<Object> words = new ArrayList<Object>();
        words.add(new Object("red", "weṭeṭṭi",R.drawable.color_red,R.raw.color_red));
        words.add(new Object("green", "chokokki",R.drawable.color_green,R.raw.color_green));
        words.add(new Object("brown", "ṭakaakki",R.drawable.color_brown,R.raw.color_brown));
        words.add(new Object("gray", "ṭopoppi",R.drawable.color_gray,R.raw.color_gray));
        words.add(new Object("black", "kululli",R.drawable.color_black,R.raw.color_black));
        words.add(new Object("white", "kelelli",R.drawable.color_white,R.raw.color_white));
        words.add(new Object("dusty yellow", "ṭopiisә",R.drawable.color_dusty_yellow,R.raw.color_dusty_yellow));
        words.add(new Object("mustard yellow", "chiwiiṭә",R.drawable.color_mustard_yellow,R.raw.color_mustard_yellow));



        WordAdapter itemsAdapter = new WordAdapter(this, words,R.color.purple);
        ListView listView = (ListView) findViewById(R.id.list_View);
        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Object word = words.get(position);
                mediaPlayer = MediaPlayer.create(Colors.this,word.getmAudiofile());
                mediaPlayer.start();
            }

        });

    }
}
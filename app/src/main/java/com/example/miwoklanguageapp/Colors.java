package com.example.miwoklanguageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Colors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        ArrayList<Object> words = new ArrayList<Object>();
        words.add(new Object("red", "weṭeṭṭi",R.drawable.color_red));
        words.add(new Object("green", "chokokki",R.drawable.color_green));
        words.add(new Object("brown", "ṭakaakki",R.drawable.color_brown));
        words.add(new Object("gray", "ṭopoppi",R.drawable.color_gray));
        words.add(new Object("black", "kululli",R.drawable.color_black));
        words.add(new Object("white", "kelelli",R.drawable.color_white));
        words.add(new Object("dusty yellow", "ṭopiisә",R.drawable.color_dusty_yellow));
        words.add(new Object("mustard yellow", "chiwiiṭә",R.drawable.color_mustard_yellow));



        WordAdapter itemsAdapter = new WordAdapter(this, words,R.color.purple);
        ListView listView = (ListView) findViewById(R.id.list_View);
        listView.setAdapter(itemsAdapter);

    }
}
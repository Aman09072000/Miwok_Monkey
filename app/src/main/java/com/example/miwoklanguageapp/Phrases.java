package com.example.miwoklanguageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Phrases extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        ArrayList<Object> words = new ArrayList<Object>();
        words.add(new Object("Where are you going?","minto wuksus"));
        words.add(new Object("What is your name?","tinnә oyaase'nә"));
        words.add(new Object("My name is...","oyaaset..."));
        words.add(new Object("How are you feeling?","michәksәs?"));
        words.add(new Object("I’m feeling good.","kuchi achit"));
        words.add(new Object("Are you coming?","әәnәs'aa?"));
        words.add(new Object("Yes, I’m coming.","hәә’ әәnәm"));
        words.add(new Object("I’m coming.","әәnәm"));
        words.add(new Object("Let’s go.","yoowutis"));
        words.add(new Object("Come here.","әnni'nem"));

        WordAdapter itemsAdapter = new WordAdapter(this,words,R.color.yellow);
        ListView listView = (ListView)findViewById(R.id.list_View);
        listView.setAdapter(itemsAdapter);

    }
}
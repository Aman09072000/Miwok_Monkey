package com.example.miwoklanguageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Familymembers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_familymembers);

        ArrayList<Object> words = new ArrayList<Object>();
        words.add(new Object("father","әpә",R.drawable.family_father));
        words.add(new Object("mother","әṭa",R.drawable.family_mother));
        words.add(new Object("son","angsi",R.drawable.family_son));
        words.add(new Object("daughter","tune",R.drawable.family_daughter));
        words.add(new Object("older brother","taachi",R.drawable.family_older_brother));
        words.add(new Object("younger brother","chalitti",R.drawable.family_younger_brother));
        words.add(new Object("older sister","tete",R.drawable.family_older_sister));
        words.add(new Object("younger sister","kolliti",R.drawable.family_younger_sister));
        words.add(new Object("grandmother","ama",R.drawable.family_grandmother));
        words.add(new Object("grandfather","paapa",R.drawable.family_grandfather));

        WordAdapter itemsAdapter = new WordAdapter(this,words,R.color.oramge);
        ListView listView = (ListView)findViewById(R.id.list_View);
        listView.setAdapter(itemsAdapter);

    }
}
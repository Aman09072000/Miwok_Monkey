package com.example.miwoklanguageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Familymembers extends AppCompatActivity {
    private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_familymembers);

        ArrayList<Object> words = new ArrayList<Object>();
        words.add(new Object("father","әpә",R.drawable.family_father,R.raw.family_father));
        words.add(new Object("mother","әṭa",R.drawable.family_mother,R.raw.family_mother));
        words.add(new Object("son","angsi",R.drawable.family_son,R.raw.family_son));
        words.add(new Object("daughter","tune",R.drawable.family_daughter,R.raw.family_daughter));
        words.add(new Object("older brother","taachi",R.drawable.family_older_brother,R.raw.family_older_brother));
        words.add(new Object("younger brother","chalitti",R.drawable.family_younger_brother,R.raw.family_younger_brother));
        words.add(new Object("older sister","tete",R.drawable.family_older_sister,R.raw.family_older_sister));
        words.add(new Object("younger sister","kolliti",R.drawable.family_younger_sister,R.raw.family_younger_sister));
        words.add(new Object("grandmother","ama",R.drawable.family_grandmother,R.raw.family_grandmother));
        words.add(new Object("grandfather","paapa",R.drawable.family_grandfather,R.raw.family_grandfather));

        WordAdapter itemsAdapter = new WordAdapter(this,words,R.color.oramge);
        ListView listView = (ListView)findViewById(R.id.list_View);
        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Object word = words.get(position);
                mediaPlayer = MediaPlayer.create(Familymembers.this,word.getmAudiofile());
                mediaPlayer.start();
            }

        });

    }
}
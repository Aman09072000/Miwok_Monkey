package com.example.miwoklanguageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Phrases extends AppCompatActivity {
    private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        ArrayList<Object> words = new ArrayList<Object>();
        words.add(new Object("Where are you going?","minto wuksus",R.raw.phrase_where_are_you_going));
        words.add(new Object("What is your name?","tinnә oyaase'nә",R.raw.phrase_what_is_your_name));
        words.add(new Object("My name is...","oyaaset...",R.raw.phrase_my_name_is));
        words.add(new Object("How are you feeling?","michәksәs?",R.raw.phrase_how_are_you_feeling));
        words.add(new Object("I’m feeling good.","kuchi achit",R.raw.phrase_im_feeling_good));
        words.add(new Object("Are you coming?","әәnәs'aa?",R.raw.phrase_are_you_coming));
        words.add(new Object("Yes, I’m coming.","hәә’ әәnәm",R.raw.phrase_yes_im_coming));
        words.add(new Object("I’m coming.","әәnәm",R.raw.phrase_im_coming));
        words.add(new Object("Let’s go.","yoowutis",R.raw.phrase_lets_go));
        words.add(new Object("Come here.","әnni'nem",R.raw.phrase_come_here));

        WordAdapter itemsAdapter = new WordAdapter(this,words,R.color.yellow);
        ListView listView = (ListView)findViewById(R.id.list_View);
        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Object word = words.get(position);
                mediaPlayer = MediaPlayer.create(Phrases.this,word.getmAudiofile());
                mediaPlayer.start();
            }

        });

    }
}
package com.example.miwoklanguageapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;
import java.util.List;
public class WordAdapter extends ArrayAdapter<Object> {
    private int mColorResourceId;

    public WordAdapter(@NonNull Context context, ArrayList<Object> words,int colorResourceId) {
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.mylayout, parent, false);
        }

        Object currentWord = getItem(position);

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.textView1);
        miwokTextView.setText(currentWord.getMiwokTranslation());
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.textView2);
        defaultTextView.setText(currentWord.getDefaultTranslation());

        ImageView icon = (ImageView)listItemView.findViewById(R.id.imageView);
        if(currentWord.hasImage()){
            icon.setImageResource(currentWord.getmIcon());}
        else
            icon.setVisibility(View.GONE);
//...............................................................................

        View testContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(),mColorResourceId);
        testContainer.setBackgroundColor(color);

        return listItemView;
    }
}

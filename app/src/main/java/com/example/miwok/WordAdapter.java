package com.example.miwok;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    //constructor
    public WordAdapter(Activity context, ArrayList<Word> wordsArray) {
        super(context, 0, wordsArray);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //check if we're reusing an existing view, if not then inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        //get word object at the current position
        Word currentWord = getItem(position);

        //find TextView from list_item.xml and set it
        TextView miwokWord = (TextView) listItemView.findViewById(R.id.miwok_word);
        miwokWord.setText(currentWord.getMiwokTranslation());

        //find TextView from list_item.xml and set it
        TextView englishWord = (TextView) listItemView.findViewById(R.id.english_word);
        englishWord.setText(currentWord.getEnglishTranslation());

        //return the whole layout so it can be shown
        return listItemView;
    }
}

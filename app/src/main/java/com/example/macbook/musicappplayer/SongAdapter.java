package com.example.macbook.musicappplayer;

import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

/**
 * Created by macbook on 3/17/17.
 */

public class SongAdapter extends ArrayAdapter<Songlist>{
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;

        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.songlist, parent,false);

            Songlist currentSonglist = getItem(position);

            ListView songNameText = (ListView) listItemView.findViewById(R.id.songTitle);

            songNameText.


            return super.getView(position, convertView, parent);
        }

}
}

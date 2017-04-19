package com.example.macbook.musicappplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.concurrent.locks.Condition;

import static com.example.macbook.musicappplayer.R.id.songTitle;

public class ArraylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        ArrayList<Songlist> songstitle = new ArrayList<Songlist>();

        songstitle.add(new Songlist("BeeGee's","Boogie"));
        songstitle.add(new Songlist("Chic","Freakout"));
        songstitle.add(new Songlist("Chic","GoodTimes"));
        songstitle.add(new Songlist("Chic","Motown"));
        songstitle.add(new Songlist("Paul","Electric Slide"));
        songstitle.add(new Songlist("Rick Ross","Hustle"));

        SongAdapter adapter = new SongAdapter(this,Songlist);


        ListView listView = (ListView)findViewById(songTitle);
        listView.setAdapter(adapter);
    }


    }


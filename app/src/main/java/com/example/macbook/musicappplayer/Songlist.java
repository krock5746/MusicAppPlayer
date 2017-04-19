package com.example.macbook.musicappplayer;

import android.content.Context;
import android.view.View;

/**
 *{@link Songlist} shows the name of the song
 *  Created by macbook on 3/16/17.
 */

public class Songlist {
    private String msongName;
    private String msongTitle;


    public Songlist(String songName, String songTitle){
        msongName = songName;
        msongTitle = songTitle;

    }
    public String getSongName(){
        return msongName;
    }
    public String getSongTitle(){
        return msongTitle;
    }

}

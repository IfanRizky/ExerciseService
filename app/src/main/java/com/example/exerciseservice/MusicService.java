package com.example.exerciseservice;

import android.app.Service;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.os.PowerManager;

import java.util.ArrayList;

public class MusicService extends Service implements
    MediaPlayer.OnPreparedListener,
    MediaPlayer.OnErrorListener,
    MediaPlayer.OnCompletionListener {

        //media player
        private MediaPlayer player;

        //song list
        private ArrayList<Song> songs;

        //current position
        private int songPosn;

        @Override
        public IBinder onBind(Intent intent) {
            // TODO Auto-generated method stub
            return null;
        }

        public void onCreate() {
            //create the service
            super.onCreate();

            //initialize position
            songPosn = 0;

            //create player
            player = new MediaPlayer();

            initMusicPlayer();
        }

        public void initMusicPlayer(){
            //set player properties
            player.setWakeMode(getApplicationContext(),
                    PowerManager.PARTIAL_WAKE_LOCK);
            player.setAudioStreamType(AudioManager.STREAM_MUSIC);

            player.setOnPreparedListener(this);
            player.setOnCompletionListener(this);
            player.setOnErrorListener(this);
        }
}


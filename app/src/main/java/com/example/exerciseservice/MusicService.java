package com.example.exerciseservice;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

import java.util.ArrayList;

public class MusicService extends Service implements {
    MediaPlayer.OnPreparedListener,
    MediaPlayer.OnErrorListener,
    MediaPlayer.OnCompletionListener {

        @Override
        public IBinder onBind() {
            // TODO Auto-generated method stub
        }
    }
}

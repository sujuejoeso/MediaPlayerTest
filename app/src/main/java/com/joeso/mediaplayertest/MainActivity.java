package com.joeso.mediaplayertest;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mMediaPlayer;
    Button bnPlay;
    Button bnPause;
    Button bnStop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bnPlay=findViewById(R.id.bn_play);
        bnPause=findViewById(R.id.bn_pause);
        bnStop=findViewById(R.id.bn_stop);

        mMediaPlayer=new MediaPlayer();
    }
}

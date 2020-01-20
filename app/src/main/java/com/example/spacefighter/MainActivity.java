package com.example.spacefighter;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.AudioManager;
import android.media.Image;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {



    MediaPlayer mediaPlayer;

    public void playMe(View view){
        mediaPlayer = MediaPlayer.create(,R.raw.davissquareshuffle);
        mediaPlayer.start();
    }

    private ImageButton buttonPlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);


        buttonPlay = findViewById(R.id.button3);


        buttonPlay.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {


        startActivity(new Intent(this, GameActivity.class));
    }
}
package com.example.android.musicplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mediaPlayer = MediaPlayer.create(this, R.raw.song);
    }

    /**
     * This method is called when play button is pressed
     * @param view
     */
    public void playMethod(View view) {
        this.mediaPlayer.start();
    }

    /**
     * This method is called when pause button is pressed
     * @param view
     */
    public void pauseMethod(View view) {
        this.mediaPlayer.pause();
    }

    /**
     * This method is called when reset button is pressed
     * @param view
     */
    public void resetMethod(View view) {
        this.mediaPlayer.reset();
    }
}

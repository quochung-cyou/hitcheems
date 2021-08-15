package com.quochung.bonk;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void clickevent(View v) {
        ImageView object = findViewById(R.id.object);
        object.setImageResource(R.drawable.object2);
        MediaPlayer mp = MediaPlayer.create(this, R.raw.soundeffect);
        mp.start();

        Handler handler = new Handler();
        handler.postDelayed(() -> {
            object.setImageResource(R.drawable.object1);
            mp.reset();
            mp.release();
        }, 500);



    }

}
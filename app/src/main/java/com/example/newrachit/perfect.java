package com.example.newrachit;



import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelStoreOwner;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class perfect extends AppCompatActivity {
    ImageButton clk1, clk2, clk3;
    MediaPlayer mdx;
    MediaPlayer mediaPlayer;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfect);
        clk1 = (ImageButton) findViewById(R.id.playid1);
        clk2 = (ImageButton) findViewById(R.id.pauseid1);
        clk3 = (ImageButton) findViewById(R.id.stopid1);
        mediaPlayer = MediaPlayer.create(perfect.this, R.raw.love2);

        clk1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.start();
            }
        });
        clk2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.pause();
            }
        });
        clk3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(perfect.this, R.raw.love2);
            }
        });

    }

}
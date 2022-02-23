package com.example.appsuperutil;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {

    private Button btnAudio = null;
    private Button btnParar= null;
    private Button btnFechar2= null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        btnAudio = (Button) findViewById(R.id.btn_audio);
        btnFechar2 = (Button) findViewById(R.id.btn_fechar2);
        btnParar = (Button) findViewById(R.id.btn_parar);
        final MediaPlayer ring = MediaPlayer.create(MainActivity3.this, R.raw.audio);


        btnAudio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    if (!ring.isPlaying()) {
                        ring.start();
                    }
                }

                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        btnFechar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnParar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    ring.stop();
                    ring.prepare();
                }

                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
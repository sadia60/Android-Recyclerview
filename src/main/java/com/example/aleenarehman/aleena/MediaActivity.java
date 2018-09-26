package com.example.aleenarehman.aleena;

/**
 * Created by Aleena Rehman on 11/09/2017.
 */

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MediaActivity extends AppCompatActivity {

    Button play,pause,stop,restart;
    private TextView TV;
    public ImageView MV;
    public Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.media_layout);
        play=(Button)findViewById(R.id.play_btn);
        pause=(Button)findViewById(R.id.pause_btn);
        stop=(Button)findViewById(R.id.stop_btn);
        restart=(Button)findViewById(R.id.restart_btn);
        TV=(TextView)findViewById(R.id.med_text);
        MV=(ImageView)findViewById(R.id.med_img);
        //creating media player

        String flag=getIntent().getStringExtra("FlagName");
        TV.setText(flag);

        String img = getIntent().getStringExtra("FlagKey");
        int image_id=getResources().getIdentifier(img,"drawable",getPackageName());
        MV.setImageResource(image_id);

        String low_flag = flag.toLowerCase();
        System.out.println("low"+low_flag);
        int sound_id = getResources().getIdentifier(low_flag,"raw",getPackageName());

        final MediaPlayer mp;
        mp = MediaPlayer.create(this,sound_id);




  /*      try{
            //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
            mp.setDataSource(Environment.getExternalStorageDirectory().getPath()+"/Music/maine.mp3");


        }catch(Exception e){e.printStackTrace();}
*/

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                mp.start();
            }
        });
        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.pause();
            }
        });
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.stop();
            }
        });

        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp.pause();
                mp.seekTo(0);
                mp.start();

            }
        });


    }
}

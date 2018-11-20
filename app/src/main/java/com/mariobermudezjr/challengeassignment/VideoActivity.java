package com.mariobermudezjr.challengeassignment;

import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import java.util.Locale;

public class VideoActivity extends AppCompatActivity implements View.OnClickListener {

    Typeface tf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);


        // Initialize Image Views
        ImageView imageView = findViewById(R.id.imageView);
        ImageView imageView1 = findViewById(R.id.imageView1);
        ImageView imageView2 = findViewById(R.id.imageView2);
        ImageView imageView3 = findViewById(R.id.imageView3);
        ImageView imageView4 = findViewById(R.id.imageView4);
        ImageView imageView5 = findViewById(R.id.imageView5);

//        // Typeface
//        AssetManager am = this.getApplicationContext().getAssets();
//        tf = Typeface.createFromAsset(am, String.format(Locale.US, "fonts/%s", "courier.ttf"));
//
//        // Text View
        TextView textView = findViewById(R.id.videoPlayer);
        textView.bringToFront();
//        textView.setTypeface(tf);

        // Make Image Views Clickable
        imageView.setOnClickListener(this);
        imageView1.setOnClickListener(this);
        imageView2.setOnClickListener(this);
        imageView3.setOnClickListener(this);
        imageView4.setOnClickListener(this);
        imageView5.setOnClickListener(this);

        imageView.setOnLongClickListener(new View.OnLongClickListener(){

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub

                // Toast.makeText(getApplicationContext(), "Long Press worked!", Toast.LENGTH_SHORT).show();
                Intent dummyPage = new Intent(VideoActivity.this,DummyActivity.class);
                startActivity(dummyPage);
                return true;
            }

        });
        imageView1.setOnLongClickListener(new View.OnLongClickListener(){

            @Override
            public boolean onLongClick(View v) {

                // Toast.makeText(getApplicationContext(), "Long Press 1 worked!", Toast.LENGTH_SHORT).show();
                Intent dummyPage = new Intent(VideoActivity.this,DummyActivity.class);
                startActivity(dummyPage);

                return true;
            }

        });
        imageView2.setOnLongClickListener(new View.OnLongClickListener(){

            @Override
            public boolean onLongClick(View v) {

                // Toast.makeText(getApplicationContext(), "Long Press 2 worked!", Toast.LENGTH_SHORT).show();
                Intent dummyPage = new Intent(VideoActivity.this,DummyActivity.class);
                startActivity(dummyPage);

                return true;
            }

        });
        imageView3.setOnLongClickListener(new View.OnLongClickListener(){

            @Override
            public boolean onLongClick(View v) {

                // Toast.makeText(getApplicationContext(), "Long Press 3 worked!", Toast.LENGTH_SHORT).show();
                Intent dummyPage = new Intent(VideoActivity.this,DummyActivity.class);
                startActivity(dummyPage);

                return true;
            }

        });
        imageView4.setOnLongClickListener(new View.OnLongClickListener(){

            @Override
            public boolean onLongClick(View v) {

                // Toast.makeText(getApplicationContext(), "Long Press 4 worked!", Toast.LENGTH_SHORT).show();
                Intent dummyPage = new Intent(VideoActivity.this,DummyActivity.class);
                startActivity(dummyPage);

                return true;
            }

        });
        imageView5.setOnLongClickListener(new View.OnLongClickListener(){

            @Override
            public boolean onLongClick(View v) {

                // Toast.makeText(getApplicationContext(), "Long Press 5 worked!", Toast.LENGTH_SHORT).show();
                Intent dummyPage = new Intent(VideoActivity.this,DummyActivity.class);
                startActivity(dummyPage);

                return true;
            }

        });

        // Setup Video View for the first time
        VideoView videoView = findViewById(R.id.videoView);
        MediaController mediaController= new MediaController(this);
        mediaController.setAnchorView(videoView);
        Uri uri= Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.sunrise);
        videoView.setMediaController(mediaController);
        videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.setMediaController(null);
//        videoView.start();


    }


    @Override
    public void onClick(View view) {
        VideoView videoView = findViewById(R.id.videoView);
        MediaController mediaController= new MediaController(this);

        switch (view.getId())
        {
            case R.id.imageView:

                mediaController.setAnchorView(videoView);
                Uri uri= Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.galaxy);
                videoView.setMediaController(mediaController);
                videoView.setVideoURI(uri);
                videoView.requestFocus();
                videoView.start();
                videoView.setMediaController(null);

                // Toast.makeText(this, "Short Press: Play galaxy.", Toast.LENGTH_SHORT).show();
                break;

            case R.id.imageView1:
                mediaController.setAnchorView(videoView);
                Uri uri1= Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.moon);
                videoView.setMediaController(mediaController);
                videoView.setVideoURI(uri1);
                videoView.requestFocus();
                videoView.start();
                videoView.setMediaController(null);
                // Toast.makeText(this, "Short Press: Play moon.", Toast.LENGTH_SHORT).show();
                break;

            case R.id.imageView2:
                mediaController.setAnchorView(videoView);
                Uri uri2= Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.clouds);
                videoView.setMediaController(mediaController);
                videoView.setVideoURI(uri2);
                videoView.requestFocus();
                videoView.start();
                videoView.setMediaController(null);
                // Toast.makeText(this, "Short Press: Play clouds.", Toast.LENGTH_SHORT).show();
                break;

            case R.id.imageView3:
                mediaController.setAnchorView(videoView);
                Uri uri3= Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.caterpillar);
                videoView.setMediaController(mediaController);
                videoView.setVideoURI(uri3);
                videoView.requestFocus();
                videoView.start();
                videoView.setMediaController(null);
                // Toast.makeText(this, "Short Press: Play caterpillar.", Toast.LENGTH_SHORT).show();
                break;

            case R.id.imageView4:
                mediaController.setAnchorView(videoView);
                Uri uri4= Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.sunrise);
                videoView.setMediaController(mediaController);
                videoView.setVideoURI(uri4);
                videoView.requestFocus();
                videoView.start();
                videoView.setMediaController(null);
                // Toast.makeText(this, "Short Press: Play sunrise.", Toast.LENGTH_SHORT).show();
                break;

            case R.id.imageView5:
                mediaController.setAnchorView(videoView);
                Uri uri5= Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.waves);
                videoView.setMediaController(mediaController);
                videoView.setVideoURI(uri5);
                videoView.requestFocus();
                videoView.start();
                videoView.setMediaController(null);
                //Toast.makeText(this, "Short Press: Play waves.", Toast.LENGTH_SHORT).show();
                break;

        }
    }
}

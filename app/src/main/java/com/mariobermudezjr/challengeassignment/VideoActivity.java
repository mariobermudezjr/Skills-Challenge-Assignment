package com.mariobermudezjr.challengeassignment;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class VideoActivity extends AppCompatActivity implements View.OnClickListener {

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

                Toast.makeText(getApplicationContext(), "Long Press worked!", Toast.LENGTH_SHORT).show();

                return true;
            }

        });
        imageView1.setOnLongClickListener(new View.OnLongClickListener(){

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub

                Toast.makeText(getApplicationContext(), "Long Press 1 worked!", Toast.LENGTH_SHORT).show();

                return true;
            }

        });
        imageView2.setOnLongClickListener(new View.OnLongClickListener(){

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub

                Toast.makeText(getApplicationContext(), "Long Press 2 worked!", Toast.LENGTH_SHORT).show();

                return true;
            }

        });
        imageView3.setOnLongClickListener(new View.OnLongClickListener(){

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub

                Toast.makeText(getApplicationContext(), "Long Press 3 worked!", Toast.LENGTH_SHORT).show();

                return true;
            }

        });
        imageView4.setOnLongClickListener(new View.OnLongClickListener(){

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub

                Toast.makeText(getApplicationContext(), "Long Press 4 worked!", Toast.LENGTH_SHORT).show();

                return true;
            }

        });
        imageView5.setOnLongClickListener(new View.OnLongClickListener(){

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub

                Toast.makeText(getApplicationContext(), "Long Press 5 worked!", Toast.LENGTH_SHORT).show();

                return true;
            }

        });

        // Setup Video View for the first time
        VideoView videoView = findViewById(R.id.videoView);
        MediaController mediaController= new MediaController(this);
        mediaController.setAnchorView(videoView);
        Uri uri= Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.video);
        videoView.setMediaController(mediaController);
        videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.start();
    }

    @Override
    public void onClick(View view) {

        switch (view.getId())
        {
            case R.id.imageView:

                Toast.makeText(this, "Short Press video.", Toast.LENGTH_SHORT).show();
                break;

            case R.id.imageView1:

                Toast.makeText(this, "Short Press video1.", Toast.LENGTH_SHORT).show();
                break;

            case R.id.imageView2:

                Toast.makeText(this, "Short Press video2.", Toast.LENGTH_SHORT).show();
                break;

            case R.id.imageView3:

                Toast.makeText(this, "Short Press video3.", Toast.LENGTH_SHORT).show();
                break;

            case R.id.imageView4:

                Toast.makeText(this, "SShort Press video4.", Toast.LENGTH_SHORT).show();
                break;

            case R.id.imageView5:

                Toast.makeText(this, "Short Press video5.", Toast.LENGTH_SHORT).show();
                break;

        }
    }
}

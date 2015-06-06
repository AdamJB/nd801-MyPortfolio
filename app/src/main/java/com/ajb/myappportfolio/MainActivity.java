package com.ajb.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button mSpotifyBtn;
    private Button mScoresBtn;
    private Button mLibraryBtn;
    private Button mBuildBtn;
    private Button mReaderBtn;
    private Button mCapstoneBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSpotifyBtn = (Button) findViewById(R.id.spotify);
        mScoresBtn = (Button) findViewById(R.id.scores);
        mLibraryBtn = (Button) findViewById(R.id.library);
        mBuildBtn = (Button) findViewById(R.id.builditbigger);
        mReaderBtn = (Button) findViewById(R.id.reader);
        mCapstoneBtn = (Button) findViewById(R.id.capstone);

        mSpotifyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showButtonMessage("spotify");
            }
        });

        mScoresBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showButtonMessage("scores");
            }
        });

        mLibraryBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showButtonMessage("library");
            }
        });

        mBuildBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showButtonMessage("build it bigger");
            }
        });

        mReaderBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showButtonMessage("reader");
            }
        });

        mCapstoneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showButtonMessage("capstone");
            }
        });
    }

    private void showButtonMessage(String message) {
        Toast.makeText(this, getString(R.string.launch_message, message), Toast.LENGTH_SHORT)
                .show();
    }
}

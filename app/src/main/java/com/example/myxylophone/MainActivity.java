package com.example.myxylophone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";


    // Helpful Constants
    private final int NR_OF_SIMULTANEOUS_SOUNDS = 7;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;

    // TODO: Add member variables here
    private SoundPool mSoundPoll;
    private int mCSoundId;
    private int mDSoundId;
    private int mESoundId;
    private int mFSoundId;
    private int mGSoundId;
    private int mASoundId;
    private int mBSoundId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Create a new SoundPool
        mSoundPoll = new SoundPool(NR_OF_SIMULTANEOUS_SOUNDS, AudioManager.STREAM_MUSIC, 0);


        // TODO: Load and get the IDs to identify the sounds
        mCSoundId = mSoundPoll.load(getApplicationContext(), R.raw.note1_c, 1);
        mDSoundId = mSoundPoll.load(getApplicationContext(), R.raw.note2_d, 1);
        mESoundId = mSoundPoll.load(getApplicationContext(), R.raw.note3_e, 1);
        mFSoundId = mSoundPoll.load(getApplicationContext(), R.raw.note4_f, 1);
        mGSoundId = mSoundPoll.load(getApplicationContext(), R.raw.note5_g, 1);
        mASoundId = mSoundPoll.load(getApplicationContext(), R.raw.note6_a, 1);
        mBSoundId = mSoundPoll.load(getApplicationContext(), R.raw.note7_b, 1);


    }

    // TODO: Add the play methods triggered by the buttons
    public void playC(View view) {
        Log.d(TAG, "playC: is clicked.");
        mSoundPoll.play(mCSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }


    public void playD(View view) {
        mSoundPoll.play(mDSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }

    public void playE(View view) {
        mSoundPoll.play(mESoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }

    public void playF(View view) {
        mSoundPoll.play(mFSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }

    public void playG(View view) {
        mSoundPoll.play(mGSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }

    public void playA(View view) {
        mSoundPoll.play(mASoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }

    public void playB(View view) {
        mSoundPoll.play(mBSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
}

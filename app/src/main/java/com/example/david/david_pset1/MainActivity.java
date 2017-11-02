package com.example.david.david_pset1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView nose, ears, eyes, mouth, mustache, hat, shoes, arms, glasses, eyebrows;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // gets the images
        nose = findViewById(R.id.nose);
        ears = findViewById(R.id.ears);
        eyes = findViewById(R.id.eyes);
        mouth = findViewById(R.id.mouth);
        mustache = findViewById(R.id.mustache);
        hat = findViewById(R.id.hat);
        shoes = findViewById(R.id.shoes);
        arms = findViewById(R.id.arms);
        glasses = findViewById(R.id.glasses);
        eyebrows = findViewById(R.id.eyebrows);
        // initialize all images on invisible
        nose.setVisibility(View.INVISIBLE);
        ears.setVisibility(View.INVISIBLE);
        eyes.setVisibility(View.INVISIBLE);
        mouth.setVisibility(View.INVISIBLE);
        mustache.setVisibility(View.INVISIBLE);
        hat.setVisibility(View.INVISIBLE);
        shoes.setVisibility(View.INVISIBLE);
        arms.setVisibility(View.INVISIBLE);
        glasses.setVisibility(View.INVISIBLE);
        eyebrows.setVisibility(View.INVISIBLE);
    }
    protected void onSaveInstanceState(Bundle out) {
        super.onSaveInstanceState(out);
        out.putInt("arms_vis", arms.getVisibility());
        out.putInt("ears_vis", ears.getVisibility());
        out.putInt("eyebrows_vis", eyebrows.getVisibility());
        out.putInt("eyes_vis", eyes.getVisibility());
        out.putInt("glasses_vis", glasses.getVisibility());
        out.putInt("hat_vis", hat.getVisibility());
        out.putInt("mouth_vis", mouth.getVisibility());
        out.putInt("mustache_vis", mustache.getVisibility());
        out.putInt("nose_vis", nose.getVisibility());
        out.putInt("shoes_vis", shoes.getVisibility());

    }
    protected void onRestoreInstanceState(Bundle in) {
        super.onRestoreInstanceState(in);
        arms.setVisibility(in.getInt("arms_vis"));
        ears.setVisibility(in.getInt("ears_vis"));
        eyebrows.setVisibility(in.getInt("eyebrows_vis"));
        eyes.setVisibility(in.getInt("eyes_vis"));
        glasses.setVisibility(in.getInt("glasses_vis"));
        hat.setVisibility(in.getInt("hat_vis"));
        mouth.setVisibility(in.getInt("mouth_vis"));
        mustache.setVisibility(in.getInt("mustache_vis"));
        nose.setVisibility(in.getInt("nose_vis"));
        shoes.setVisibility(in.getInt("shoes_vis"));
    }

    public void clicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()) {
            case R.id.eyesBox:
                if(checked) {
                    eyes.setVisibility(View.VISIBLE);
                } else {
                    eyes.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.earsBox:
                if(checked) {
                    ears.setVisibility(View.VISIBLE);
                } else {
                    ears.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.shoesBox:
                if(checked) {
                    shoes.setVisibility(View.VISIBLE);
                } else {
                    shoes.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.mustacheBox:
                if(checked) {
                    mustache.setVisibility(View.VISIBLE);
                } else {
                    mustache.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.glassesBox:
                if(checked) {
                    glasses.setVisibility(View.VISIBLE);
                } else {
                    glasses.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.mouthBox:
                if(checked) {
                    mouth.setVisibility(View.VISIBLE);
                } else {
                    mouth.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.noseBox:
                if(checked) {
                    nose.setVisibility(View.VISIBLE);
                } else {
                    nose.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.hatBox:
                if(checked) {
                    hat.setVisibility(View.VISIBLE);
                } else {
                    hat.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.eyebrowsBox:
                if(checked) {
                    eyebrows.setVisibility(View.VISIBLE);
                } else {
                    eyebrows.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.armsBox:
                if(checked) {
                    arms.setVisibility(View.VISIBLE);
                } else {
                    arms.setVisibility(View.INVISIBLE);
                }
                break;
        }
    }
}
package com.halitbakir.androidd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class imageTutorials extends AppCompatActivity {

    //Global değişkenler
    private ImageView ImageViewInternetPictures;
    private String internetPicturesUrl="https://ecodation.com/wp-content/uploads/2022/12/Turk_Telekom_logo.png";

    //internetten foto çekmek
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_tutorials);
        //ID
        ImageViewInternetPictures=findViewById(R.id.ImageViewInternetPictures);
        Glide.with(getApplicationContext())
                .load(internetPicturesUrl)
                .into(ImageViewInternetPictures);

    }
}
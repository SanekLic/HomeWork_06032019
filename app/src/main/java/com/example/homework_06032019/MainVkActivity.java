package com.example.homework_06032019;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.Window;
import android.widget.ImageView;

public class MainVkActivity extends AppCompatActivity {
    private Toolbar mainVkToolbar;
    private ImageView vkPhotoCircyleImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_ACTION_BAR);
        setContentView(R.layout.activity_main_vk);

        initialView();
        setUserPhoto();
        setToolbar();
    }

    private void initialView() {
        vkPhotoCircyleImageView = findViewById(R.id.vkPhotoCircyleImageView);
        mainVkToolbar = findViewById(R.id.mainVkToolbar);
    }

    private void setUserPhoto() {
        Bitmap bitmapUserPhoto = BitmapFactory.decodeResource(getResources(), R.drawable.ic_user_photo);
        RoundedBitmapDrawable circularDrawable = RoundedBitmapDrawableFactory.create(getResources(), bitmapUserPhoto);
        circularDrawable.setCircular(true);
        vkPhotoCircyleImageView.setImageDrawable(circularDrawable);
    }

    private void setToolbar() {
        setSupportActionBar(mainVkToolbar);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowTitleEnabled(false);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_vk_toolbar, menu);

        return true;
    }
}

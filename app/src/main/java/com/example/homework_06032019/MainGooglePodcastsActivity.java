package com.example.homework_06032019;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.Window;

public class MainGooglePodcastsActivity extends AppCompatActivity {
    private Toolbar mainGoolgePodcastsToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_ACTION_BAR);
        setContentView(R.layout.activity_main_google_podcasts);

        mainGoolgePodcastsToolbar = findViewById(R.id.mainGoolgePodcastsToolbar);
        setSupportActionBar(mainGoolgePodcastsToolbar);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayShowTitleEnabled(false);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_google_podcasts_toolbar, menu);

        return true;
    }
}

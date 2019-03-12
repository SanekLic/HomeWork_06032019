package com.example.homework_06032019;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.Window;

public class MainVkActivity extends AppCompatActivity {
    private Toolbar mainVkToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_ACTION_BAR);
        setContentView(R.layout.activity_main_vk);

        mainVkToolbar = findViewById(R.id.mainVkToolbar);
        setSupportActionBar(mainVkToolbar);
        mainVkToolbar.inflateMenu(R.menu.menu_vk_toolbar);

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

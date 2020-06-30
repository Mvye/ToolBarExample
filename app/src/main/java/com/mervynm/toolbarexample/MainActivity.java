package com.mervynm.toolbarexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Toolbar bar = findViewById(R.id.toolBar);
        bar.setTitle("Hello");

        bar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                if (item.getItemId() == R.id.menuItemHello1) {
                    bar.setTitle("Hello 1");
                }
                if (item.getItemId() == R.id.menuItemHello2) {
                    bar.setTitle("Hello 2");
                }
                if (item.getItemId() == R.id.menuITemHello3) {
                    bar.setTitle("Hello 3");
                }

                return true;
            }
        });
    }
}
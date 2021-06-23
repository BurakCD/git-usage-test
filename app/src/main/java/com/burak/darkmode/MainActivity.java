package com.burak.darkmode;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    private String isim, Soyisim = "Burak";

    private Button normalMod, karanlikMod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        normalMod = findViewById(R.id.normalMod);
        karanlikMod = findViewById(R.id.karanlikMod);

        normalMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getDelegate().setLocalNightMode(AppCompatDelegate.MODE_NIGHT_NO);
            }
        });

        karanlikMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getDelegate().setLocalNightMode(AppCompatDelegate.MODE_NIGHT_YES);
            }
        });

    }
}
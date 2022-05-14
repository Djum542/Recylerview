package com.example.recyclerview29032022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Date date = new Date();
        date.setTime(5400000);

        final int ic_launcher_background = R.drawable.ic_launcher_background;
    }

}
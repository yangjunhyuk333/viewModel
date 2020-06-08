package com.junhyuk.mvvmstudy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MainViewModel mainViewModel = new ViewModelProvider(this,
                new ViewModelProvider.AndroidViewModelFactory(getApplication())).get(MainViewModel.class);

        mainViewModel.findId(MainActivity.this);

        mainViewModel.button1Plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainViewModel.plus();
            }
        });

        mainViewModel.button2Minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainViewModel.minus();
            }
        });
    }
}
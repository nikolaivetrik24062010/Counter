package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    MainActivityViewModel model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        model = new ViewModelProvider(this)
                .get(MainActivityViewModel.class);

        textView = findViewById(R.id.textView);
        textView.setText(String.valueOf(model.getCurrentValue()));
    }

    public void decreaseValue(View view) {
        textView.setText(String.valueOf(model.getDecreasedValue()));
    }

    public void increaseValue(View view) {
        textView.setText(String.valueOf(model.getIncreasedValue()));
    }
}
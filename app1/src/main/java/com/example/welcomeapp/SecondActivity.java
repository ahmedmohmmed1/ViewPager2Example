
package com.example.welcomeapp;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView textViewWelcome = findViewById(R.id.textViewWelcome);
        String name = getIntent().getStringExtra("USER_NAME");
        String welcomeMessage = "Welcome, " + name + "!";
        textViewWelcome.setText(welcomeMessage);
    }
}

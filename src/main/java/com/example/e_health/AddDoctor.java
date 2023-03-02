package com.example.e_health;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class AddDoctor extends AppCompatActivity {

    Button addBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_doctor);

        addBtn = findViewById(R.id.addDocBtn);


    }
}
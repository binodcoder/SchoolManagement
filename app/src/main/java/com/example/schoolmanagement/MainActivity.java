package com.example.schoolmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_admin).setOnClickListener(v->{
Intent intent=new Intent(MainActivity.this, AdminLogin.class);
startActivity(intent);
        });
        findViewById(R.id.btn_student).setOnClickListener(v->{
            Intent intent=new Intent(MainActivity.this, StudentLogin.class);
            startActivity(intent);
        });
    }
}
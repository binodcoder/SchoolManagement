package com.example.schoolmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class StudentLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_login);

        findViewById(R.id.btn_student_login).setOnClickListener(v->{
            Intent intent=new Intent(StudentLogin.this, Home.class);
            startActivity(intent);
        });
    }
}
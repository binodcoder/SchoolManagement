package com.example.schoolmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class AddStudent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_student);

        findViewById(R.id.btn_add).setOnClickListener(v->{
            Intent intent=new Intent(AddStudent.this, StudentProfile.class);
            startActivity(intent);
        });


    }
}
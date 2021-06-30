package com.example.schoolmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class AdminLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login);

        findViewById(R.id.btn_admin_login).setOnClickListener(v->{
            Intent intent=new Intent(AdminLogin.this, ViewStudent.class);
            startActivity(intent);
        });
    }
}
package com.example.schoolmanagement;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String STUDENT_TABLE="STUDENT_TABLE";
    public static final String USER_ID="ID";
    public static final String USER_NAME="USERNAME";
    public static final String USER_ADDRESS="ADDRESS";


    public DatabaseHelper(@Nullable Context context) {
        super(context, "sms.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String createStudentTableQuery="CREATE TABLE "+STUDENT_TABLE+"("+USER_ID+" INTEGER PRIMARY KEY AUTOINCREMENT, "+USER_NAME+" TEXT, "+USER_ADDRESS+" INTEGER);";
        db.execSQL(createStudentTableQuery);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}

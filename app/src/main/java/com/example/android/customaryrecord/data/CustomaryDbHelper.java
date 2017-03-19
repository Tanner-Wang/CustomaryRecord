package com.example.android.customaryrecord.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import static com.example.android.customaryrecord.data.CustomaryContract.CREATE_TABLE;
import static com.example.android.customaryrecord.data.CustomaryContract.DELETE_TABLE;

/**
 * Created by Administrator on 2017/3/20.
 */

public class CustomaryDbHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "customaryRecord.db";
    public static final int DATABASE_VERSION = 1;

    public CustomaryDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(DELETE_TABLE);
        onCreate(db);
    }
}

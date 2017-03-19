package com.example.android.customaryrecord;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.android.customaryrecord.data.CustomaryDbHelper;

import static com.example.android.customaryrecord.data.CustomaryContract.Entry;

public class MainActivity extends AppCompatActivity {

    CustomaryDbHelper mDbHelper = new CustomaryDbHelper(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    /**
     *Method of insert record
     */
    private long insertCustomary(String activity, int startTime, int endTime) {

        SQLiteDatabase db = mDbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(Entry.COLUMN_ACTIVITY, activity);
        values.put(Entry.COLUMN_STARTTIME, startTime);
        values.put(Entry.COLUMN_EDNTIME, endTime);

        return db.insert(Entry.TABLE_NAME, null, values);
    }

    /**
     *Method of reading data
     */
    private Cursor requestRecord() {

        SQLiteDatabase db = mDbHelper.getReadableDatabase();
        String[] projection = {
                Entry._ID,
                Entry.COLUMN_ACTIVITY,
                Entry.COLUMN_STARTTIME,
                Entry.COLUMN_EDNTIME
        };
        Cursor cursor = db.query(
                Entry.TABLE_NAME,
                projection,
                null,
                null,
                null,
                null,
                null
        );
        return cursor;
    }

    /**Method of updating record
     *
     *Suppose to update the time of the activity "Walk the dog"
     */
    private void upDateRecord(String activity, int startTime, int endTime) {
        SQLiteDatabase db = mDbHelper.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(Entry.COLUMN_ACTIVITY, activity);
        values.put(Entry.COLUMN_STARTTIME, startTime);
        values.put(Entry.COLUMN_EDNTIME, endTime);

        String selection = Entry.COLUMN_ACTIVITY + " =?";
        String[] selectionArgs = {"Walk the dog."};

        int count = db.update(
                Entry.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }
}

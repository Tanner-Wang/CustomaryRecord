package com.example.android.customaryrecord.data;

import android.provider.BaseColumns;

/**
 * Created by Administrator on 2017/3/19.
 */

public final class CustomaryContract {

    private CustomaryContract() {
    }

    public static final class Entry implements BaseColumns {

        public static final String TABLE_NAME = "customary record";
        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_ACTIVITY = "activity";
        public static final String COLUMN_STARTTIME = "start time(hour)";
        public static final String COLUMN_EDNTIME = "end time(hour)";
    }

    public static final String TEXT_TYPE = " TEXT";
    public static final String INTEGER_TYPE = " INTEGER";
    public static final String COMMA_SEP = ",";
    public static final String CREATE_TABLE = "CREATE TABLE " + Entry.TABLE_NAME + "(" +
            Entry._ID + INTEGER_TYPE + COMMA_SEP +
            Entry.COLUMN_ACTIVITY + TEXT_TYPE + COMMA_SEP +
            Entry.COLUMN_STARTTIME + INTEGER_TYPE + COMMA_SEP +
            Entry.COLUMN_EDNTIME + INTEGER_TYPE + ")";


    public static final String DELETE_TABLE = "DROP TABLE IF EXIST " + Entry.TABLE_NAME;
}

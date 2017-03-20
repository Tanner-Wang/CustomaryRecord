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
        public static final String COLUMN_DAY_OF_MONTH = "day of month";
        public static final String COLUMN_START_TIME = "start time(1-24)";
        public static final String COLUMN_EDN_TIME = "end time(1-24)";
    }

    public static final String TEXT_TYPE = " TEXT";
    public static final String INTEGER_TYPE = " INTEGER";
    public static final String COMMA_SEP = ",";
    public static final String CREATE_TABLE = "CREATE TABLE " + Entry.TABLE_NAME + "(" +
            Entry._ID + INTEGER_TYPE + COMMA_SEP +
            Entry.COLUMN_ACTIVITY + TEXT_TYPE + COMMA_SEP +
            Entry.COLUMN_DAY_OF_MONTH+INTEGER_TYPE+COMMA_SEP+
            Entry.COLUMN_START_TIME + INTEGER_TYPE + COMMA_SEP +
            Entry.COLUMN_EDN_TIME + INTEGER_TYPE + ")";


    public static final String DELETE_TABLE = "DROP TABLE IF EXIST " + Entry.TABLE_NAME;
}

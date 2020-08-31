package com.example.complainapp;

import android.provider.BaseColumns;

class MemoryContract {


    //An empty private constructor makes sure that the class is not going to be initialised.
    private MemoryContract() {}

    public static final class MemoryEntry implements BaseColumns {
        public static final String TABLE_NAME = "memories";
        public static final String COLUMN_TITLE = "title";
        public static final String COLUMN_IMAGE = "image";
    }
}

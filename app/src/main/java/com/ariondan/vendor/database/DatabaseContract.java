package com.ariondan.vendor.database;

import android.provider.BaseColumns;

/**
 * Created by USER on 7/17/2017.
 */

class DatabaseContract {

    static final int CURSOR_ID = 0;
    static final int CURSOR_EMAIL = 1;
    static final int CURSOR_PASSWORD = 2;

    abstract class UserContractEntry implements BaseColumns {
        static final String TABLE_NAME = "User";
        static final String COLUMN_ID = "Id";
        static final String COLUMN_EMAIL = "Email";
        static final String COLUMN_PASSWORD = "Password";
    }

}

package com.ariondan.vendor.database;

/**
 * Created by USER on 7/17/2017.
 */

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import static com.ariondan.vendor.database.DatabaseContract.CURSOR_ID;

class DatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "database.db";

    private static final int DATABASE_VERSION = 1;

    private static final String DATABASE_QUERY = "CREATE TABLE " + DatabaseContract.UserContractEntry.TABLE_NAME + " (" +
            DatabaseContract.UserContractEntry.COLUMN_ID + " NUMBER," +
            DatabaseContract.UserContractEntry.COLUMN_EMAIL + " TEXT," +
            DatabaseContract.UserContractEntry.COLUMN_PASSWORD + " TEXT);";


    DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase database) {
        database.execSQL(DATABASE_QUERY);
    }

    @Override
    public void onUpgrade(SQLiteDatabase database, int i, int i1) {
    }

    void addUser(String email, String password) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(DatabaseContract.UserContractEntry.COLUMN_ID, getGenerateId());
        contentValues.put(DatabaseContract.UserContractEntry.COLUMN_EMAIL, email);
        contentValues.put(DatabaseContract.UserContractEntry.COLUMN_PASSWORD, password);
        getWritableDatabase().insert(DatabaseContract.UserContractEntry.TABLE_NAME, null, contentValues);
    }

    Cursor getUsers() {
        String[] list = {DatabaseContract.UserContractEntry.COLUMN_ID,
                DatabaseContract.UserContractEntry.COLUMN_EMAIL,
                DatabaseContract.UserContractEntry.COLUMN_PASSWORD};
        return getReadableDatabase().query(DatabaseContract.UserContractEntry.TABLE_NAME, list, null, null, null, null, null);
    }

    private int getGenerateId() {
        int id = 0;
        Cursor cursor = getUsers();
        if (cursor.moveToLast()) {
            id = cursor.getInt(CURSOR_ID);
        }
        cursor.close();
        return ++id;
    }


}



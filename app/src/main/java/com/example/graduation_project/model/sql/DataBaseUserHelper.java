package com.example.graduation_project.model.sql;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class DataBaseUserHelper extends SQLiteOpenHelper {

    // Database Version
    private static final int DATABASE_VERSION = 5;

    // Database Name
    private static final String DATABASE_NAME = "user.db";
    Context context;

    public DataBaseUserHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(userSql.CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        // Drop older table if existed
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + userSql.TABLE_NAME);

        // Create tables again
        onCreate(sqLiteDatabase);
    }

    public Boolean insertDataUser(String token, int userId, String userName, String userGpa, String userDeptID,String role) {
        // get writable database as we want to write data
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        // `id` and `timestamp` will be inserted automatically.
        // no need to add them
        values.put(userSql.COLUMN_Token, token);
        values.put(userSql.COLUM_USER_ID, userId);
        values.put(userSql.COLUMN_USER_NAME,userName);
        values.put(userSql.COLUMN_GPA,userGpa);
        values.put(userSql.COLUMN_DEPT_ID,userDeptID);
        values.put(userSql.COLUMN_MANAGER_ROLE,role);
        // insert row
        long res = db.insert(userSql.TABLE_NAME, null, values);
        if (res == -1) {
            return false;
        } else {
            return true;
        }
    }


    public List<userSql> getAllRecord() {
        List<userSql> list = new ArrayList<>();
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM usertable", null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                userSql data = new userSql();
                data.setId(Integer.parseInt(cursor.getString(0)));
                data.setToken(cursor.getString(1));
                data.setUserId(Integer.parseInt(cursor.getString(2)));
                data.setUserName(cursor.getString(3));
                data.setUserGPA(cursor.getString(4));
                data.setUserDeptID(cursor.getString(5));
                data.setRole(cursor.getString(6));
                // Adding note to list
                list.add(data);
            } while (cursor.moveToNext());
        }

        return list;
    }



    public void deleteAll() {
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("delete from " + userSql.TABLE_NAME);
    }
}

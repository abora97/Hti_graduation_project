package com.example.graduation_project.model.sql;

public class userSql {
    public static final String TABLE_NAME = "usertable";

    public static final String COLUMN_ID = "id";
    public static final String COLUMN_Token = "token";
    public static final String COLUM_USER_ID="userid";


    private int id;
    private String token;
    private int userId;

    // Create table SQL query
    public static final String CREATE_TABLE =
            "CREATE TABLE " + TABLE_NAME + "("
                    + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + COLUMN_Token + " TEXT, "
                    + COLUM_USER_ID+" TEXT "
                    + ")";

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public userSql(int id, String token, int userId) {
        this.id = id;
        this.token = token;
        this.userId = userId;
    }

    userSql() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}

package com.example.graduation_project.model.sql;

public class userSql {
    public static final String TABLE_NAME = "usertable";

    public static final String COLUMN_ID = "id";
    public static final String COLUMN_Token = "token";
    public static final String COLUM_USER_ID = "userid";
    public static final String COLUMN_USER_NAME = "username";
    public static final String COLUMN_GPA = "gpa";
    public static final String COLUMN_DEPT_ID = "deptid";
    public static final String COLUMN_MANAGER_ROLE="role";


    private int id;
    private String token;
    private int userId;
    private String userName;
    private String userGPA;
    private String userDeptID;
    private String role;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserGPA() {
        return userGPA;
    }

    public void setUserGPA(String userGPA) {
        this.userGPA = userGPA;
    }

    public String getUserDeptID() {
        return userDeptID;
    }

    public void setUserDeptID(String userDeptID) {
        this.userDeptID = userDeptID;
    }

    // Create table SQL query
    public static final String CREATE_TABLE =
            "CREATE TABLE " + TABLE_NAME + "("
                    + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + COLUMN_Token + " TEXT, "
                    + COLUM_USER_ID + " TEXT, "
                    + COLUMN_USER_NAME + " TEXT, "
                    + COLUMN_GPA + " TEXT, "
                    + COLUMN_DEPT_ID + " TEXT, "
                    + COLUMN_MANAGER_ROLE + " TEXT "
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

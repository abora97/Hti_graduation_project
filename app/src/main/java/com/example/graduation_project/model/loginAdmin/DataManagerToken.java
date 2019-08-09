
package com.example.graduation_project.model.loginAdmin;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DataManagerToken implements Serializable
{

    @SerializedName("token")
    @Expose
    private String token;
    @SerializedName("manager")
    @Expose
    private Manager manager;
    private final static long serialVersionUID = -2099967182651237594L;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

}


package com.example.graduation_project.model.login;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoginModel implements Serializable
{

    @SerializedName("data")
    @Expose
    private LoginData data;
    private final static long serialVersionUID = -4406961364460515510L;

    public LoginData getData() {
        return data;
    }

    public void setData(LoginData data) {
        this.data = data;
    }

}

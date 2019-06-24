
package com.example.graduation_project.model.login;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoginData implements Serializable
{

    @SerializedName("successful")
    @Expose
    private boolean successful;
    @SerializedName("data")
    @Expose
    private DataToken data;
    @SerializedName("status")
    @Expose
    private int status;
    private final static long serialVersionUID = -3280415194790581124L;

    public boolean isSuccessful() {
        return successful;
    }

    public void setSuccessful(boolean successful) {
        this.successful = successful;
    }

    public DataToken getData() {
        return data;
    }

    public void setData(DataToken data) {
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

}

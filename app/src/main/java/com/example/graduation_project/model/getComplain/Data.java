
package com.example.graduation_project.model.getComplain;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data implements Serializable
{

    @SerializedName("successful")
    @Expose
    private boolean successful;
    @SerializedName("data")
    @Expose
    private Data_ data;
    @SerializedName("status")
    @Expose
    private int status;
    private final static long serialVersionUID = -9125123116562283237L;

    public boolean isSuccessful() {
        return successful;
    }

    public void setSuccessful(boolean successful) {
        this.successful = successful;
    }

    public Data_ getData() {
        return data;
    }

    public void setData(Data_ data) {
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

}

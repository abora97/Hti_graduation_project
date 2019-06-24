
package com.example.graduation_project.model.subject;

import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SubjectData implements Serializable {

    @SerializedName("successful")
    @Expose
    private boolean successful;
    @SerializedName("data")
    @Expose
    private DataSubject data;
    @SerializedName("status")
    @Expose
    private int status;
    private final static long serialVersionUID = -3113189986344322881L;

    public boolean isSuccessful() {
        return successful;
    }

    public void setSuccessful(boolean successful) {
        this.successful = successful;
    }

    public DataSubject getData() {
        return data;
    }

    public void setData(DataSubject data) {
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

}


package com.example.graduation_project.model.getComplain;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GetComplaints implements Serializable
{

    @SerializedName("data")
    @Expose
    private Data data;
    private final static long serialVersionUID = -5086786076520585486L;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

}

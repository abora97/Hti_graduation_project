
package com.example.graduation_project.model.DeanDoctorSubject;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DeanDoctor implements Serializable
{

    @SerializedName("data")
    @Expose
    private Data data;
    private final static long serialVersionUID = 3100291742681188869L;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

}


package com.example.graduation_project.model.DoctorSubject;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GetDoctorSubject implements Serializable
{

    @SerializedName("data")
    @Expose
    private Data data;
    private final static long serialVersionUID = 7271794448207610904L;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

}

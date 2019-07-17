
package com.example.graduation_project.model.Complain;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Complain implements Serializable
{

    @SerializedName("data")
    @Expose
    private Data data;
    private final static long serialVersionUID = 8625245240490718501L;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

}

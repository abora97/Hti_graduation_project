
package com.example.graduation_project.model.Complain;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data_ implements Serializable
{

    @SerializedName("complain")
    @Expose
    private Complain_ complain;
    private final static long serialVersionUID = 7335890695074183626L;

    public Complain_ getComplain() {
        return complain;
    }

    public void setComplain(Complain_ complain) {
        this.complain = complain;
    }

}

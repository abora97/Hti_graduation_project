
package com.example.graduation_project.model.getComplain;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data_ implements Serializable
{

    @SerializedName("complains")
    @Expose
    private List<Complain> complains = null;
    private final static long serialVersionUID = 2092784673416435437L;

    public List<Complain> getComplains() {
        return complains;
    }

    public void setComplains(List<Complain> complains) {
        this.complains = complains;
    }

}


package com.example.graduation_project.model.deanDepartment;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data_ implements Serializable
{

    @SerializedName("departments")
    @Expose
    private List<Department> departments = null;
    private final static long serialVersionUID = 7679185906380754759L;

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

}

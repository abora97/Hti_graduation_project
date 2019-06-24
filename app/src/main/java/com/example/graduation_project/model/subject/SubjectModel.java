
package  com.example.graduation_project.model.subject;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SubjectModel implements Serializable
{

    @SerializedName("data")
    @Expose
    private SubjectData data;
    private final static long serialVersionUID = 7399040808418911009L;

    public SubjectData getData() {
        return data;
    }

    public void setData(SubjectData data) {
        this.data = data;
    }

}

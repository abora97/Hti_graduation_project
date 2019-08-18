package com.example.graduation_project.callBack;


import com.example.graduation_project.model.getComplain.GetComplaints;

public interface GetComplainCallBack {
    void onError(String msg);

    void onSecuess(GetComplaints complain);
}

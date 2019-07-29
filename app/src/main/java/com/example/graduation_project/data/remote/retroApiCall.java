package com.example.graduation_project.data.remote;

import com.example.graduation_project.util.Constant;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.POST;

public interface retroApiCall {
//    @POST("posts")
//    Call<ResponseBody> createNewPost(@Par)

    @POST("questionnaires")
    Call<ResponseBody> getResponse();
}

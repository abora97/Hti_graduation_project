package com.example.graduation_project.data.remote;

import com.example.graduation_project.util.Constant;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface RetroApiCall {
//    @POST("posts")
//    Call<ResponseBody> createNewPost(@Par)

    @POST("questionnaires")
    Call<ResponseBody> getResponse();

    @POST("complains")
    @FormUrlEncoded
    Call<ResponseBody> getJsonPlaceHolder(@Field(Constant.COMPLAIN_DEPART) int departmentID, @Field(Constant.COMPLAIN_TYPE) String type, @Field(Constant.COMPLAIN_TOPIC) String topic, @Field(Constant.COMPLAIN_DESCRIPTION) String desc);
}

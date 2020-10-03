package com.example.testmainactivity.api;

import com.example.testmainactivity.data.StudentData;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface StudentApi {// Restful API 簡例
    @GET("/ebookapi/api/{method}")  //指定變數{method}
    Call<List<StudentData>> getStudentList(@Path("method") String method); //指定可輸入變數

    @GET("/ebookapi/api/{method}")  //指定變數{method}
    Call<List<StudentData>> getStudentList(@Path("method") String method, @Query("level") String level); //指定可輸入變數

}
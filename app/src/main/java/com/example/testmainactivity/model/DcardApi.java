package com.example.testmainactivity.model;

import com.example.testmainactivity.model.DcardData;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface DcardApi {// Restful API 簡例
    @GET("/_api/{type}")  //指定變數{type}
    Call<List<DcardData>> getDcardList(@Path("type") String type); //指定可輸入變數

    @GET("/_api/{type}")  //指定變數{type}
    Call<List<DcardEntity>> getDcardEntities(@Path("type") String type); //指定可輸入變數

    @GET("/_api/{method}")  //指定變數{method}
    Call<List<DcardData>> getStudentList(@Path("method") String method, @Query("level") String level); //指定可輸入變數

}
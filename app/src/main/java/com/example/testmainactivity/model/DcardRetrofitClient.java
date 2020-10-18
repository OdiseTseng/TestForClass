package com.example.testmainactivity.model;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class DcardRetrofitClient {
    private static final String BASE_URL = "https://dcard.tw";
    private static DcardRetrofitClient instance;
    private Retrofit retrofit;
    public static synchronized DcardRetrofitClient getInstance() {
        if (instance == null) {
            instance = new DcardRetrofitClient();
        }
        return instance;
    }
    private DcardRetrofitClient() {

        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
            loggingInterceptor.level(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient okHttpClient = new OkHttpClient().newBuilder()
                .connectTimeout(30, TimeUnit.SECONDS)
                .addInterceptor(loggingInterceptor)
                .build();
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)  //可不用，但為了追蹤所以還是建議開啟
                .build();
    }
    public DcardApi getDcardApi(){
        return retrofit.create(DcardApi.class);
    }
}

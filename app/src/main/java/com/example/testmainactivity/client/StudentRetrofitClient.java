package com.example.testmainactivity.client;

import com.example.testmainactivity.api.StudentApi;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class StudentRetrofitClient {
    private static final String BASE_URL = "https://odata.tn.edu.tw";
    private static StudentRetrofitClient instance;
    private Retrofit retrofit;
    public static synchronized StudentRetrofitClient getInstance() {
        if (instance == null) {
            instance = new StudentRetrofitClient();
        }
        return instance;
    }
    private StudentRetrofitClient() {

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
    public StudentApi getStudentApi(){
        return retrofit.create(StudentApi.class);
    }
}

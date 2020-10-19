package com.example.testmainactivity.viewmodel;

import android.app.Application;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.arch.core.util.Function;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;

import com.example.testmainactivity.model.DcardApi;
import com.example.testmainactivity.model.DcardData;
import com.example.testmainactivity.model.DcardEntity;
import com.example.testmainactivity.model.DcardRetrofitClient;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SecViewModel extends AndroidViewModel {

    MutableLiveData<List<DcardEntity>> dcardEntityList;
    LiveData<List<DcardEntity>> dcardRefreshEntityList;
    ExecutorService ioExecutor;

//    private ArrayList<DcardData> dcardDataList;
    private ArrayList<DcardEntity> dcardEntities;

    public SecViewModel(@NonNull Application application) {
        super(application);
//        dcardDataList = new ArrayList<>();
        ioExecutor = Executors.newSingleThreadExecutor();
        dcardEntityList = new MutableLiveData<>();
        dcardRefreshEntityList = Transformations.switchMap(dcardRefreshEntityList, new Function<List<DcardEntity>, LiveData<List<DcardEntity>>>() {
            @Override
            public LiveData<List<DcardEntity>> apply(List<DcardEntity> input) {
                fetchDataFromApi("posts");
                return dcardEntityList;
            }
        });
    }

//    public void fetchDataFromApi(String target){
//        DcardApi dcardApi = DcardRetrofitClient.getInstance().getDcardApi();
//        Call<List<DcardData>> dcardList = dcardApi.getDcardList(target);
//
//        dcardList.enqueue(new Callback<List<DcardData>>() {
//            @Override
//            public void onResponse(Call<List<DcardData>> call, Response<List<DcardData>> response) {
//                for(DcardData dcardData:response.body()){
//                    Log.e("apiCall", dcardData.toString() );
////                    dacrdDataArrayList.add(dcardData);
////                    dcardDataList.add(dcardData);
//                }
////                Log.i("dcardDataArrayList",dcardDataList.size() +"");
//            }
//
//            @Override
//            public void onFailure(Call<List<DcardData>> call, Throwable t) {
//
//            }
//        });
//    }

    public void fetchDataFromApi(String target){
        DcardApi dcardApi = DcardRetrofitClient.getInstance().getDcardApi();
        Call<List<DcardEntity>> dcardList = dcardApi.getDcardEntities(target);

        dcardEntities = new ArrayList<>();

        dcardList.enqueue(new Callback<List<DcardEntity>>() {
            @Override
            public void onResponse(Call<List<DcardEntity>> call, Response<List<DcardEntity>> response) {
                for(DcardEntity dcardData:response.body()){
                    Log.e("apiCall", dcardData.toString() );
//                    dacrdDataArrayList.add(dcardData);
//                    dcardDataList.add(dcardData);

                    dcardEntities.add(dcardData);
                }
//                Log.i("dcardDataArrayList",dcardDataList.size() +"");

                dcardEntityList.postValue(dcardEntities);
            }

            @Override
            public void onFailure(Call<List<DcardEntity>> call, Throwable t) {

            }
        });
    }

//    public ArrayList<DcardData> getDcardDataList() {
//        return dcardDataList;
//    }
    public LiveData<List<DcardEntity>> getDcardRefreshEntityList(){
        return dcardRefreshEntityList;
    }
}

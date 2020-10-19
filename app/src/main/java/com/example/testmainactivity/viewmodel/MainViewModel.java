package com.example.testmainactivity.viewmodel;

import android.app.Application;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.example.testmainactivity.model.DcardApi;
import com.example.testmainactivity.model.DcardData;
import com.example.testmainactivity.model.DcardRetrofitClient;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainViewModel extends AndroidViewModel {

    private ArrayList<DcardData> dcardDataList;

    public MainViewModel(@NonNull Application application) {
        super(application);

        dcardDataList = new ArrayList<>();
    }

    public void fetchDataFromApi(String target){
        DcardApi dcardApi = DcardRetrofitClient.getInstance().getDcardApi();
        Call<List<DcardData>> dcardList = dcardApi.getDcardList(target);

        dcardList.enqueue(new Callback<List<DcardData>>() {
            @Override
            public void onResponse(Call<List<DcardData>> call, Response<List<DcardData>> response) {
                for(DcardData dcardData:response.body()){
                    Log.e("apiCall", dcardData.toString() );
//                    dacrdDataArrayList.add(dcardData);
                    dcardDataList.add(dcardData);
                }
                Log.i("dcardDataArrayList",dcardDataList.size() +"");
//                dcardPostAdapter.setDcardDataList(dacrdDataArrayList);
//                dcardPostAdapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<List<DcardData>> call, Throwable t) {

            }
        });
    }

    public ArrayList<DcardData> getDcardDataList() {
        return dcardDataList;
    }
}

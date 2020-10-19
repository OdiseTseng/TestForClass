package com.example.testmainactivity.view;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.testmainactivity.R;
import com.example.testmainactivity.model.DcardData;
import com.example.testmainactivity.model.DcardEntity;

import java.util.ArrayList;
import java.util.List;

public class DcardPostAdapter extends RecyclerView.Adapter<DcardViewHolder> {

    ArrayList<DcardData> dcardDataList;
    List<DcardEntity> dcardEntities;

    @NonNull
    @Override
    public DcardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_dcard_post_layout, parent, false);
        return new DcardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DcardViewHolder holder, int position) {
//        DcardData dcardData = dcardDataList.get(position);
//        Log.d("dcardData", dcardData.toString());
//        if (dcardData != null){
//            holder.bind(dcardData);
//        }

        DcardEntity dcardEntity = dcardEntities.get(position);
                if (dcardEntity != null){
            holder.bind(dcardEntity);
        }

    }

    @Override
    public int getItemCount() {
        return dcardDataList == null ?  0 : dcardDataList.size();
    }

    public void setDcardDataList(ArrayList<DcardData> dcardDataList){
        this.dcardDataList = dcardDataList;
    }

    public void setDcardEntities(List<DcardEntity> entityArrayList){
        this.dcardEntities = entityArrayList;
    }
}

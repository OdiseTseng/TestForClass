package com.example.testmainactivity.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.testmainactivity.R;
import com.example.testmainactivity.data.DcardData;
import com.example.testmainactivity.holder.DcardViewHolder;

import java.util.ArrayList;

public class DcardPostAdapter extends RecyclerView.Adapter<DcardViewHolder> {

    ArrayList<DcardData> dcardDataList;

    @NonNull
    @Override
    public DcardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_dcard_post_layout, parent, false);
        return new DcardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DcardViewHolder holder, int position) {
        DcardData dcardData = dcardDataList.get(position);

        if (dcardData != null){
            holder.bind(dcardData);
        }
    }

    @Override
    public int getItemCount() {
        return dcardDataList == null ?  0 : dcardDataList.size();
    }

    public void setDcardDataList(ArrayList<DcardData> dcardDataList){
        this.dcardDataList = dcardDataList;
    }
}

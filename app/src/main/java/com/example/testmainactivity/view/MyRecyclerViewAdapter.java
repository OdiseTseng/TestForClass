package com.example.testmainactivity.view;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.testmainactivity.R;

import java.util.List;
import java.util.Random;

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewHolder> {
    List<String> itemList;
    @NonNull
    @Override
    public MyRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);    //0-29格
//        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_grid_layout, parent, false);
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_grid_layout2, parent, false);
        return new MyRecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyRecyclerViewHolder holder, int position) {
        String data = itemList.get(position);
        /*                  //0-29格
        if(data != null){
            holder.bind(data);
            holder.setIntent(data);
        }
        */

        if(data != null) {
            Log.i("Adapter",position+"");
            if (position % 2 == 0) {

                holder.bind11(data);
                holder.bind12(new Random().nextDouble()*1000 + 1 + "");

            } else {
                holder.bind13(data);
                holder.bind14(new Random().nextDouble()*1000 + 1 + "");
            }
        }


//        if(data != null){
//            holder.bind6(data);
//            holder.bind8(new Random().nextDouble()*1000 + 1 + "");
//
//        }
    }

    @Override
    public int getItemCount() {
        return itemList == null ? 0 : itemList.size();
    }

    public void setItemList(List<String> itemList){
        this.itemList = itemList;
    }
}

package com.example.testmainactivity.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.testmainactivity.R;
import com.example.testmainactivity.data.StudentData;
import com.example.testmainactivity.holder.GenderViewHolder;

import java.util.ArrayList;

public class GenderAdapter extends RecyclerView.Adapter<GenderViewHolder> {

    ArrayList<StudentData> studentDataList;

    @NonNull
    @Override
    public GenderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_gender_layout, parent, false);
        return new GenderViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GenderViewHolder holder, int position) {
        StudentData studentData = studentDataList.get(position);

        if (studentData != null){
            holder.bind(studentData);
        }
    }

    @Override
    public int getItemCount() {
        return studentDataList == null ?  0 : studentDataList.size();
    }

    public void setStudentDataList(ArrayList<StudentData> studentDataList){
        this.studentDataList = studentDataList;
    }
}

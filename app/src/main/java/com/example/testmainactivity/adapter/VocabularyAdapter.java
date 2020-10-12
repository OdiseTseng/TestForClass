package com.example.testmainactivity.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.testmainactivity.R;
import com.example.testmainactivity.data.VocabularyData;
import com.example.testmainactivity.data.WordData;
import com.example.testmainactivity.holder.VocabularyViewHolder;

import java.util.ArrayList;

public class VocabularyAdapter extends RecyclerView.Adapter<VocabularyViewHolder> {

    ArrayList<WordData> wordDataList;

    @NonNull
    @Override
    public VocabularyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_vocabulary_layout, parent, false);
        return new VocabularyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VocabularyViewHolder holder, int position) {
        WordData studentData = wordDataList.get(position);

        if (studentData != null){
            holder.bind(studentData);
        }
    }

    @Override
    public int getItemCount() {
        return wordDataList == null ?  0 : wordDataList.size();
    }

    public void setStudentDataList(VocabularyData vocabularyData){
        this.wordDataList = vocabularyData.getWords();
    }
}

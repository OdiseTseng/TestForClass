package com.example.testmainactivity.holder;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.testmainactivity.R;
import com.example.testmainactivity.data.VocabularyData;
import com.example.testmainactivity.data.WordData;

public class VocabularyViewHolder extends RecyclerView.ViewHolder {

    TextView textMeans;
    TextView textStar;
    TextView textWord;
    String means;
    LinearLayout linearVocabulary;
    public VocabularyViewHolder(@NonNull View itemView) {
        super(itemView);
//        textMeans = itemView.findViewById(R.id.textMeans);
        textStar = itemView.findViewById(R.id.textStar);
        textWord = itemView.findViewById(R.id.textWord);
        linearVocabulary = itemView.findViewById(R.id.linearVocabulary);
    }

    public void bind(WordData wordData){
        textWord.setText(wordData.getWord());
        textStar.setText(wordData.getStar());
        means = wordData.getMeans();


//        if("女".equals(studentData.getSex())){
//            linearSchool.setBackgroundColor(linearSchool.getResources().getColor(R.color.colorPink));
//        }else{
//            linearSchool.setBackgroundColor(linearSchool.getResources().getColor(R.color.colorPrimary));
//        }
    }
}

package com.example.testmainactivity.view;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.testmainactivity.R;
import com.example.testmainactivity.model.WordData;

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

        textWord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view.getId() == R.id.textWord){
                    AlertDialog alertDialog = new AlertDialog.Builder(itemView.getContext())
                            .setTitle("")
                            .setMessage(means)
                            .setPositiveButton("關閉視窗", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {

                                }
                            }).show();
                }
            }
        });
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

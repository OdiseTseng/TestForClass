package com.example.testmainactivity.holder;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.testmainactivity.R;
import com.example.testmainactivity.data.StudentData;

public class GenderViewHolder extends RecyclerView.ViewHolder {

    TextView textSchool;
    TextView textSex;
    TextView textNum;
    LinearLayout linearSchool;
    public GenderViewHolder(@NonNull View itemView) {
        super(itemView);
        textSchool = itemView.findViewById(R.id.textSchool);
        textSex = itemView.findViewById(R.id.textSex);
        textNum = itemView.findViewById(R.id.textNum);
        linearSchool = itemView.findViewById(R.id.linearSchool);
    }

    public void bind(StudentData studentData){
        textSchool.setText(studentData.getSchool());
        textSex.setText(studentData.getSex());
        textNum.setText(studentData.getNum());

        if("女".equals(studentData.getSex())){
            linearSchool.setBackgroundColor(linearSchool.getResources().getColor(R.color.colorPink));
        }else{
            linearSchool.setBackgroundColor(linearSchool.getResources().getColor(R.color.colorPrimary));
        }
    }
}

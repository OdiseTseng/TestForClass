package com.example.testmainactivity.view;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.testmainactivity.R;
import com.example.testmainactivity.model.DcardData;
import com.example.testmainactivity.model.DcardEntity;

public class DcardViewHolder extends RecyclerView.ViewHolder {

    TextView txtForumName;
    TextView txtPosterSchool;
    TextView txtTitle;
//    LinearLayout linearSchool;
    TextView txtExcerpt;
    TextView txtLikeCnt;
    TextView txtResponse;
    TextView txtCommCnt;

    public DcardViewHolder(@NonNull View itemView) {
        super(itemView);
        txtForumName = itemView.findViewById(R.id.txtForumName);
        txtPosterSchool = itemView.findViewById(R.id.txtPosterSchool);
        txtTitle = itemView.findViewById(R.id.txtTitle);
//        linearSchool = itemView.findViewById(R.id.linearSchool);
        txtExcerpt = itemView.findViewById(R.id.txtExcerpt);
        txtLikeCnt = itemView.findViewById(R.id.txtLikeCnt);
//        txtResponse = itemView.findViewById(R.id.txtResponse);
        txtCommCnt = itemView.findViewById(R.id.txtCommCnt);

    }

    public void bind(DcardData dcardData){

//        if("女".equals(dcardData.getSex())){
//            linearSchool.setBackgroundColor(linearSchool.getResources().getColor(R.color.colorPink));
//        }else{
//            linearSchool.setBackgroundColor(linearSchool.getResources().getColor(R.color.colorPrimary));
//        }

        txtForumName.setText(dcardData.getForumName());
        txtPosterSchool.setText(dcardData.getSchool());
        txtTitle.setText(dcardData.getTitle());
        txtExcerpt.setText(dcardData.getExcerpt());
        txtLikeCnt.setText(dcardData.getLikeCount());

        txtCommCnt.setText(dcardData.getCommentCount());
    }

    public void bind(DcardEntity dcardEntity){

//        if("女".equals(dcardEntity.getSex())){
//            linearSchool.setBackgroundColor(linearSchool.getResources().getColor(R.color.colorPink));
//        }else{
//            linearSchool.setBackgroundColor(linearSchool.getResources().getColor(R.color.colorPrimary));
//        }

        txtForumName.setText(dcardEntity.getForumName());
        txtPosterSchool.setText(dcardEntity.getSchool());
        txtTitle.setText(dcardEntity.getTitle());
        txtExcerpt.setText(dcardEntity.getExcerpt());
        txtLikeCnt.setText(dcardEntity.getLikeCount());

        txtCommCnt.setText(dcardEntity.getCommentCount());
    }

}

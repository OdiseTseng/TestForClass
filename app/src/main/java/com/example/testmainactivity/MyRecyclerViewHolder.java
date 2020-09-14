package com.example.testmainactivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class MyRecyclerViewHolder extends RecyclerView.ViewHolder {
    LinearLayout linearLayout;
    TextView textView;
    TextView textView6;
    TextView textView7;
    TextView textView8;
    TextView textView9;
    TextView textView11;
    TextView textView12;
    TextView textView13;
    TextView textView14;
    ConstraintLayout cLayout1;
    LinearLayout lLayout1;
    Intent intent;
    public MyRecyclerViewHolder(@NonNull View itemView){
        super(itemView);
        textView = itemView.findViewById(R.id.textView2);
        linearLayout = itemView.findViewById(R.id.linearLayout1);

        textView6 = itemView.findViewById(R.id.textView11);
        textView7 = itemView.findViewById(R.id.textView12);
        textView8 = itemView.findViewById(R.id.textView13);
        textView9 = itemView.findViewById(R.id.textView14);

        textView11 = itemView.findViewById(R.id.textView11);
        textView12 = itemView.findViewById(R.id.textView12);
        textView13 = itemView.findViewById(R.id.textView13);
        textView14 = itemView.findViewById(R.id.textView14);

        cLayout1 = itemView.findViewById(R.id.clayout1);
        lLayout1 = itemView.findViewById(R.id.lLayout1);

    }

    public void bind(String string){
        textView.setText(string);
    }

    public void bind6(String string){
        textView6.setText(string);
    }

    public void bind8(String string){
        textView8.setText(string);
    }

    public void bind11(String string){
        textView11.setText(string);
        cLayout1.setVisibility(View.INVISIBLE);
    }
    public void bind12(String string){
        textView12.setText(string);
    }

    public void bind13(String string){
        textView13.setText(string);
        lLayout1.setVisibility(View.INVISIBLE);
    }
    public void bind14(String string){
        textView14.setText(string);
    }

    public  void setIntent(String data){
        intent = new Intent(linearLayout.getContext(), SecondActivity.class);
        Bundle bundle = new Bundle();
        Log.i("MyRecyclerViewHolder", "data = " + data);
        bundle.putString("data",data);
        intent.putExtras(bundle);
        createOnclickListener();
    }

    public void createOnclickListener(){
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                linearLayout.getContext().startActivity(intent);
            }
        });
    }
}

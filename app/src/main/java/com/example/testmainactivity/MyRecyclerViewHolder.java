package com.example.testmainactivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyRecyclerViewHolder extends RecyclerView.ViewHolder {
    LinearLayout linearLayout;
    TextView textView;
    TextView textView6;
    TextView textView7;
    TextView textView8;
    TextView textView9;
    Intent intent;
    public MyRecyclerViewHolder(@NonNull View itemView){
        super(itemView);
        textView = itemView.findViewById(R.id.textView2);
        linearLayout = itemView.findViewById(R.id.linearLayout1);

        textView6 = itemView.findViewById(R.id.textView6);
        textView7 = itemView.findViewById(R.id.textView7);
        textView8 = itemView.findViewById(R.id.textView8);
        textView9 = itemView.findViewById(R.id.textView9);
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

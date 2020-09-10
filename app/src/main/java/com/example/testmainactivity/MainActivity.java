package com.example.testmainactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(this, SecondActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("try1","Hi");
        bundle.putString("try2","Hello");
        intent.putExtras(bundle);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycleView);

        MyRecyclerViewAdapter myRecyclerViewAdapter = new MyRecyclerViewAdapter();
        recyclerView.setAdapter(myRecyclerViewAdapter);

//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
//        recyclerView.setLayoutManager(linearLayoutManager);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getBaseContext(), 32);
        gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {    //設格行數
            @Override
            public int getSpanSize(int position) {
                return 8;
            }
        });

        recyclerView.setLayoutManager(gridLayoutManager);

//        RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
//        recyclerView.addItemDecoration(itemDecoration);
        ArrayList<String> list = new ArrayList<>();
        int cnt = 0;
        do {
            list.add("" + cnt);
        }while (cnt++ < 29);

        myRecyclerViewAdapter.setItemList(list);
        myRecyclerViewAdapter.notifyDataSetChanged();
    }
}
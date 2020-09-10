package com.example.testmainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
//            String try1 = bundle.getString("try1");
//            String try2 = bundle.getString("try2");
//
//            Log.i("SecondActivity", "try1 : " + try1);
//            Log.i("SecondActivity", "try2 : " + try2);
            String data = bundle.getString("data");

            TextView textView = findViewById(R.id.textView3);
            textView.setText(data);

            Button button = findViewById(R.id.button1);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
                }
            });
        }
    }
}
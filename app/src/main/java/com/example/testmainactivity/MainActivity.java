package com.example.testmainactivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.testmainactivity.adapter.DcardPostAdapter;
import com.example.testmainactivity.api.DcardApi;
import com.example.testmainactivity.client.DcardRetrofitClient;
import com.example.testmainactivity.data.DcardData;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Intent intent = new Intent(this, SecondActivity.class);
//        Bundle bundle = new Bundle();
//        bundle.putString("try1","Hi");
//        bundle.putString("try2","Hello");
//        intent.putExtras(bundle);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycleView);

//        MyRecyclerViewAdapter myRecyclerViewAdapter = new MyRecyclerViewAdapter();
//        recyclerView.setAdapter(myRecyclerViewAdapter);

//        final GenderAdapter genderAdapter = new GenderAdapter();
//        recyclerView.setAdapter(genderAdapter);
        DcardPostAdapter dcardPostAdapter = new DcardPostAdapter();
        recyclerView.setAdapter(dcardPostAdapter);


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
/*      //0-29格子
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getBaseContext(), 32);
        gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {    //設格行數
            @Override
            public int getSpanSize(int position) {
                return 8;
            }
        });
        recyclerView.setLayoutManager(gridLayoutManager);

        RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(itemDecoration);       //裝飾線

 */

/* 第三次作業
//http://odata.tn.edu.tw/ebookapi/api/getOdataJH/?level=all
        final ArrayList<StudentData> studentDataArrayList = new ArrayList<>();

        handler = new Handler(Looper.myLooper()){
            @Override
            public void handleMessage(final Message message){
                genderAdapter.notifyDataSetChanged();
            }
        };

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    ConnectionTool tool = new ConnectionTool("http://odata.tn.edu.tw/ebookapi/api/getOdataJH/?level=all");
                    tool.openConnection();
                       String response = tool.getResponse();
                       JSONArray array = new JSONArray(response);
                       for (int i = 0; i < array.length(); i++){
                           studentDataArrayList.add(new StudentData(array.getJSONObject(i)));
                       }
                       Log.i("studentDataArrayList",studentDataArrayList.size() +"");
                       genderAdapter.setStudentDataList(studentDataArrayList);
                       handler.sendEmptyMessage(0);
                    } catch (MalformedURLException e) {
                        Log.i("CTool Init()", e.getMessage());
                    } catch (IOException e) {
                        Log.i("CTool openConnection()", e.getMessage());
                    } catch (JSONException e) {
                        Log.i("CTool JSONArray()", e.getMessage());
                    }
                }
            });
            thread.start();
 */

//            InputJSONDataTool inputJSONDataTool = new InputJSONDataTool(this, R.raw.gender_data);
//            studentDataArrayList = inputJSONDataTool.readFile();
//        } catch (Exception e){
//            Log.i("InputJSONDataTool", e.getMessage());
//        }

        /* 重新串接student api
        ArrayList<StudentData> studentDataArrayList = new ArrayList<>();
        handler = new Handler(Looper.myLooper()){
            @Override
            public void handleMessage(final Message message){
                genderAdapter.notifyDataSetChanged();
            }
        };

        StudentApi studentApi = StudentRetrofitClient.getInstance().getStudentApi();
        Call<List<StudentData>> studentList =studentApi.getStudentList("getOdataJH", "all");
        studentList.enqueue(new Callback<List<StudentData>>() {
            @Override
            public void onResponse(Call<List<StudentData>> call, Response<List<StudentData>> response) {
                for(StudentData studentData:response.body()){
                    Log.e("apiCall", studentData.toString() );
                    studentDataArrayList.add(studentData);

                }
                Log.i("studentDataArrayList",studentDataArrayList.size() +"");
                genderAdapter.setStudentDataList(studentDataArrayList);
                handler.sendEmptyMessage(0);
            }

            @Override
            public void onFailure(Call<List<StudentData>> call, Throwable t) {

            }
        });

         */

        ArrayList<DcardData> dacrdDataArrayList = new ArrayList<>();
        handler = new Handler(Looper.myLooper()){
            @Override
            public void handleMessage(final Message message){
                dcardPostAdapter.notifyDataSetChanged();
            }
        };

        DcardApi dcardApi = DcardRetrofitClient.getInstance().getDcardApi();
        Call<List<DcardData>> dcardList =dcardApi.getDcardList("posts");
        dcardList.enqueue(new Callback<List<DcardData>>() {
            @Override
            public void onResponse(Call<List<DcardData>> call, Response<List<DcardData>> response) {
                for(DcardData dcardData:response.body()){
                    Log.e("apiCall", dcardData.toString() );
                    dacrdDataArrayList.add(dcardData);

                }
                Log.i("dcardDataArrayList",dacrdDataArrayList.size() +"");
                dcardPostAdapter.setDcardDataList(dacrdDataArrayList);
                handler.sendEmptyMessage(0);
            }

            @Override
            public void onFailure(Call<List<DcardData>> call, Throwable t) {

            }
        });

//        rrayList<String> list = new ArrayList<>();
//        int cnt = 0;
//        do {
////            list.add("" + cnt);
//            list.add(new Random().nextDouble()*1000 + 1 + "");
//        }while (cnt++ < 17);//29 //設定0-29格子A

//        myRecyclerViewAdapter.setItemList(list);
//        myRecyclerViewAdapter.notifyDataSetChanged();


    }
}
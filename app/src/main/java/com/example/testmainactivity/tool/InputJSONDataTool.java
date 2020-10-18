package com.example.testmainactivity.tool;

import android.content.Context;
import android.util.Log;

import com.example.testmainactivity.model.StudentData;
import com.example.testmainactivity.model.VocabularyData;
import com.example.testmainactivity.model.WordData;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class InputJSONDataTool {
    private InputStream inputStream;
    private BufferedReader reader;

    public InputJSONDataTool(Context context, int resource){
        inputStream = context.getResources().openRawResource(resource);
        reader = new BufferedReader(new InputStreamReader(inputStream));
    }

    public ArrayList<StudentData> readFile() throws Exception{
        String line;

        StringBuilder stringBuilder = new StringBuilder();
        ArrayList<StudentData> studentDataList = new ArrayList<>();


            while ((line = reader.readLine()) != null){
                stringBuilder.append(line);
            }
//            Log.i("studentDataList[1]", stringBuilder.toString());
            JSONArray ary = new JSONArray(stringBuilder.toString());
            for (int i = 0; i < ary.length(); i++ ) {
                Log.i("try data",ary.getJSONObject(i).toString());
                studentDataList.add(new StudentData(ary.getJSONObject(i)));
            }

        return studentDataList;
    }

    public VocabularyData readFileFromVocab() throws Exception{
        String line;

        StringBuilder stringBuilder = new StringBuilder();
        ArrayList<WordData> wordDatas = new ArrayList<>();

        while((line = reader.readLine()) != null){
            stringBuilder.append(line);
        }

        Log.i("vocabulary[1]", stringBuilder.toString());

        JSONObject jo = new JSONObject(stringBuilder.toString());

        JSONArray ary = jo.getJSONArray("words");
        for (int i=0; i <ary.length(); i++){
            Log.i("try data",ary.getJSONObject(i).toString());
            wordDatas.add(new WordData(ary.getJSONObject(i)));
        }

        VocabularyData vocabularyData = new VocabularyData();
        vocabularyData.setWords(wordDatas);

        return vocabularyData;
    }
}

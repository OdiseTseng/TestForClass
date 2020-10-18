
package com.example.testmainactivity.model;

import java.util.ArrayList;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class VocabularyData {

    @SerializedName("words")
    private ArrayList<WordData> mWordData;

    public ArrayList<WordData> getWords() {
        return mWordData;
    }

    public void setWords(ArrayList<WordData> wordData) {
        mWordData = wordData;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (WordData wordData : mWordData) {
            stringBuilder.append(wordData.toString());
        }

        return "datas : " + stringBuilder.toString();
    }
}

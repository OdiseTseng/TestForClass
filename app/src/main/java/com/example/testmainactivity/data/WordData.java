
package com.example.testmainactivity.data;

import com.google.gson.annotations.SerializedName;

import org.json.JSONException;
import org.json.JSONObject;

@SuppressWarnings("unused")
public class WordData {

    public WordData (JSONObject object) throws JSONException {
        setMeans(object.getString("means"));
        setStar(object.getString("star"));
        setWord(object.getString("word"));
    }

    @SerializedName("means")
    private String mMeans;
    @SerializedName("star")
    private String mStar;
    @SerializedName("word")
    private String mWord;

    public String getMeans() {
        return mMeans;
    }

    public void setMeans(String means) {
        mMeans = means;
    }

    public String getStar() {
        return mStar;
    }

    public void setStar(String star) {
        mStar = star;
    }

    public String getWord() {
        return mWord;
    }

    public void setWord(String word) {
        mWord = word;
    }

    @Override
    public String toString() {
        return "WordData{" +
                "mMeans='" + mMeans + '\'' +
                ", mStar='" + mStar + '\'' +
                ", mWord='" + mWord + '\'' +
                '}';
    }
}

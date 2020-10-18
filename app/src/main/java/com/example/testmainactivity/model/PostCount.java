
package com.example.testmainactivity.model;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class PostCount {

    @SerializedName("last30Days")
    private String mLast30Days;

    public String getLast30Days() {
        return mLast30Days;
    }

    public void setLast30Days(String last30Days) {
        mLast30Days = last30Days;
    }

}

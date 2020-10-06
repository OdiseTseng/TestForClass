
package com.example.testmainactivity.data;

import com.google.gson.annotations.SerializedName;


@SuppressWarnings("unused")
public class Medium {

    @SerializedName("url")
    private String mUrl;

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

}

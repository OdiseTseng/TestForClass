
package com.example.testmainactivity.data;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class PostThumbnail {

    @SerializedName("size")
    private String mSize;

    public String getSize() {
        return mSize;
    }

    public void setSize(String size) {
        mSize = size;
    }

}

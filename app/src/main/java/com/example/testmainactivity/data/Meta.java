
package com.example.testmainactivity.data;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Meta {

    @SerializedName("layout")
    private String mLayout;

    public String getLayout() {
        return mLayout;
    }

    public void setLayout(String layout) {
        mLayout = layout;
    }

}

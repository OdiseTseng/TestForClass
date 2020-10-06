
package com.example.testmainactivity.data;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Reaction {

    @SerializedName("count")
    private Long mCount;
    @SerializedName("id")
    private String mId;

    public Long getCount() {
        return mCount;
    }

    public void setCount(Long count) {
        mCount = count;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

}

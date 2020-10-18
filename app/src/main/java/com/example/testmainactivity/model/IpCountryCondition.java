
package com.example.testmainactivity.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class IpCountryCondition {

    @SerializedName("exclude")
    private List<Object> mExclude;
    @SerializedName("include")
    private List<Object> mInclude;

    public List<Object> getExclude() {
        return mExclude;
    }

    public void setExclude(List<Object> exclude) {
        mExclude = exclude;
    }

    public List<Object> getInclude() {
        return mInclude;
    }

    public void setInclude(List<Object> include) {
        mInclude = include;
    }

}

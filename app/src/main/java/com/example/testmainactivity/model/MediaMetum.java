
package com.example.testmainactivity.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class MediaMetum {

    @SerializedName("createdAt")
    private String mCreatedAt;
    @SerializedName("id")
    private String mId;
    @SerializedName("normalizedUrl")
    private String mNormalizedUrl;
    @SerializedName("tags")
    private List<String> mTags;
    @SerializedName("thumbnail")
    private String mThumbnail;
    @SerializedName("type")
    private String mType;
    @SerializedName("updatedAt")
    private String mUpdatedAt;
    @SerializedName("url")
    private String mUrl;

    public String getCreatedAt() {
        return mCreatedAt;
    }

    public void setCreatedAt(String createdAt) {
        mCreatedAt = createdAt;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public String getNormalizedUrl() {
        return mNormalizedUrl;
    }

    public void setNormalizedUrl(String normalizedUrl) {
        mNormalizedUrl = normalizedUrl;
    }

    public List<String> getTags() {
        return mTags;
    }

    public void setTags(List<String> tags) {
        mTags = tags;
    }

    public String getThumbnail() {
        return mThumbnail;
    }

    public void setThumbnail(String thumbnail) {
        mThumbnail = thumbnail;
    }

    public String getType() {
        return mType;
    }

    public void setType(String type) {
        mType = type;
    }

    public String getUpdatedAt() {
        return mUpdatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        mUpdatedAt = updatedAt;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

}

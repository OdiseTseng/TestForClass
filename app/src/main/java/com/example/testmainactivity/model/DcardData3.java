
package com.example.testmainactivity.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;


@SuppressWarnings("unused")
public class DcardData3 {

    @SerializedName("alias")
    private String mAlias;
    @SerializedName("availableLayouts")
    private List<String> mAvailableLayouts;
    @SerializedName("canPost")
    private Boolean mCanPost;
    @SerializedName("canUseNickname")
    private Boolean mCanUseNickname;
    @SerializedName("createdAt")
    private String mCreatedAt;
    @SerializedName("description")
    private String mDescription;
    @SerializedName("favorite")
    private Boolean mFavorite;
    @SerializedName("fullyAnonymous")
    private Boolean mFullyAnonymous;
    @SerializedName("hasPostCategories")
    private Boolean mHasPostCategories;
    @SerializedName("id")
    private String mId;
    @SerializedName("ignorePost")
    private Boolean mIgnorePost;
    @SerializedName("invisible")
    private Boolean mInvisible;
    @SerializedName("ipCountryCondition")
    private IpCountryCondition mIpCountryCondition;
    @SerializedName("isSchool")
    private Boolean mIsSchool;
    @SerializedName("limitCountries")
    private List<Object> mLimitCountries;
    @SerializedName("limitStage")
    private String mLimitStage;
    @SerializedName("mediaThreshold")
    private MediaThreshold mMediaThreshold;
    @SerializedName("name")
    private String mName;
    @SerializedName("nsfw")
    private Boolean mNsfw;
    @SerializedName("postCount")
    private PostCount mPostCount;
    @SerializedName("postThumbnail")
    private PostThumbnail mPostThumbnail;
    @SerializedName("postTitlePlaceholder")
    private String mPostTitlePlaceholder;
    @SerializedName("read")
    private Boolean mRead;
    @SerializedName("shouldCategorized")
    private Boolean mShouldCategorized;
    @SerializedName("shouldPostCategorized")
    private Boolean mShouldPostCategorized;
    @SerializedName("subcategories")
    private List<Object> mSubcategories;
    @SerializedName("subscribed")
    private Boolean mSubscribed;
    @SerializedName("subscriptionCount")
    private String mSubscriptionCount;
    @SerializedName("titlePlaceholder")
    private String mTitlePlaceholder;
    @SerializedName("topics")
    private List<String> mTopics;
    @SerializedName("updatedAt")
    private String mUpdatedAt;

    public String getAlias() {
        return mAlias;
    }

    public void setAlias(String alias) {
        mAlias = alias;
    }

    public List<String> getAvailableLayouts() {
        return mAvailableLayouts;
    }

    public void setAvailableLayouts(List<String> availableLayouts) {
        mAvailableLayouts = availableLayouts;
    }

    public Boolean getCanPost() {
        return mCanPost;
    }

    public void setCanPost(Boolean canPost) {
        mCanPost = canPost;
    }

    public Boolean getCanUseNickname() {
        return mCanUseNickname;
    }

    public void setCanUseNickname(Boolean canUseNickname) {
        mCanUseNickname = canUseNickname;
    }

    public String getCreatedAt() {
        return mCreatedAt;
    }

    public void setCreatedAt(String createdAt) {
        mCreatedAt = createdAt;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public Boolean getFavorite() {
        return mFavorite;
    }

    public void setFavorite(Boolean favorite) {
        mFavorite = favorite;
    }

    public Boolean getFullyAnonymous() {
        return mFullyAnonymous;
    }

    public void setFullyAnonymous(Boolean fullyAnonymous) {
        mFullyAnonymous = fullyAnonymous;
    }

    public Boolean getHasPostCategories() {
        return mHasPostCategories;
    }

    public void setHasPostCategories(Boolean hasPostCategories) {
        mHasPostCategories = hasPostCategories;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public Boolean getIgnorePost() {
        return mIgnorePost;
    }

    public void setIgnorePost(Boolean ignorePost) {
        mIgnorePost = ignorePost;
    }

    public Boolean getInvisible() {
        return mInvisible;
    }

    public void setInvisible(Boolean invisible) {
        mInvisible = invisible;
    }

    public IpCountryCondition getIpCountryCondition() {
        return mIpCountryCondition;
    }

    public void setIpCountryCondition(IpCountryCondition ipCountryCondition) {
        mIpCountryCondition = ipCountryCondition;
    }

    public Boolean getIsSchool() {
        return mIsSchool;
    }

    public void setIsSchool(Boolean isSchool) {
        mIsSchool = isSchool;
    }

    public List<Object> getLimitCountries() {
        return mLimitCountries;
    }

    public void setLimitCountries(List<Object> limitCountries) {
        mLimitCountries = limitCountries;
    }

    public String getLimitStage() {
        return mLimitStage;
    }

    public void setLimitStage(String limitStage) {
        mLimitStage = limitStage;
    }

    public MediaThreshold getMediaThreshold() {
        return mMediaThreshold;
    }

    public void setMediaThreshold(MediaThreshold mediaThreshold) {
        mMediaThreshold = mediaThreshold;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public Boolean getNsfw() {
        return mNsfw;
    }

    public void setNsfw(Boolean nsfw) {
        mNsfw = nsfw;
    }

    public PostCount getPostCount() {
        return mPostCount;
    }

    public void setPostCount(PostCount postCount) {
        mPostCount = postCount;
    }

    public PostThumbnail getPostThumbnail() {
        return mPostThumbnail;
    }

    public void setPostThumbnail(PostThumbnail postThumbnail) {
        mPostThumbnail = postThumbnail;
    }

    public String getPostTitlePlaceholder() {
        return mPostTitlePlaceholder;
    }

    public void setPostTitlePlaceholder(String postTitlePlaceholder) {
        mPostTitlePlaceholder = postTitlePlaceholder;
    }

    public Boolean getRead() {
        return mRead;
    }

    public void setRead(Boolean read) {
        mRead = read;
    }

    public Boolean getShouldCategorized() {
        return mShouldCategorized;
    }

    public void setShouldCategorized(Boolean shouldCategorized) {
        mShouldCategorized = shouldCategorized;
    }

    public Boolean getShouldPostCategorized() {
        return mShouldPostCategorized;
    }

    public void setShouldPostCategorized(Boolean shouldPostCategorized) {
        mShouldPostCategorized = shouldPostCategorized;
    }

    public List<Object> getSubcategories() {
        return mSubcategories;
    }

    public void setSubcategories(List<Object> subcategories) {
        mSubcategories = subcategories;
    }

    public Boolean getSubscribed() {
        return mSubscribed;
    }

    public void setSubscribed(Boolean subscribed) {
        mSubscribed = subscribed;
    }

    public String getSubscriptionCount() {
        return mSubscriptionCount;
    }

    public void setSubscriptionCount(String subscriptionCount) {
        mSubscriptionCount = subscriptionCount;
    }

    public String getTitlePlaceholder() {
        return mTitlePlaceholder;
    }

    public void setTitlePlaceholder(String titlePlaceholder) {
        mTitlePlaceholder = titlePlaceholder;
    }

    public List<String> getTopics() {
        return mTopics;
    }

    public void setTopics(List<String> topics) {
        mTopics = topics;
    }

    public String getUpdatedAt() {
        return mUpdatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        mUpdatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "DcardData{" +
                "mAlias='" + mAlias + '\'' +
                ", mAvailableLayouts=" + mAvailableLayouts +
                ", mCanPost=" + mCanPost +
                ", mCanUseNickname=" + mCanUseNickname +
                ", mCreatedAt='" + mCreatedAt + '\'' +
                ", mDescription='" + mDescription + '\'' +
                ", mFavorite=" + mFavorite +
                ", mFullyAnonymous=" + mFullyAnonymous +
                ", mHasPostCategories=" + mHasPostCategories +
                ", mId='" + mId + '\'' +
                ", mIgnorePost=" + mIgnorePost +
                ", mInvisible=" + mInvisible +
                ", mIpCountryCondition=" + mIpCountryCondition +
                ", mIsSchool=" + mIsSchool +
                ", mLimitCountries=" + mLimitCountries +
                ", mLimitStage='" + mLimitStage + '\'' +
                ", mMediaThreshold=" + mMediaThreshold +
                ", mName='" + mName + '\'' +
                ", mNsfw=" + mNsfw +
                ", mPostCount=" + mPostCount +
                ", mPostThumbnail=" + mPostThumbnail +
                ", mPostTitlePlaceholder='" + mPostTitlePlaceholder + '\'' +
                ", mRead=" + mRead +
                ", mShouldCategorized=" + mShouldCategorized +
                ", mShouldPostCategorized=" + mShouldPostCategorized +
                ", mSubcategories=" + mSubcategories +
                ", mSubscribed=" + mSubscribed +
                ", mSubscriptionCount='" + mSubscriptionCount + '\'' +
                ", mTitlePlaceholder='" + mTitlePlaceholder + '\'' +
                ", mTopics=" + mTopics +
                ", mUpdatedAt='" + mUpdatedAt + '\'' +
                '}';
    }
}

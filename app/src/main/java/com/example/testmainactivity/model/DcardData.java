
package com.example.testmainactivity.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class DcardData {

    @SerializedName("anonymousDepartment")
    private Boolean mAnonymousDepartment;
    @SerializedName("anonymousSchool")
    private Boolean mAnonymousSchool;
    @SerializedName("categories")
    private List<String> mCategories;
    @SerializedName("commentCount")
    private String mCommentCount;
    @SerializedName("createdAt")
    private String mCreatedAt;
    @SerializedName("customStyle")
    private Object mCustomStyle;
    @SerializedName("department")
    private String mDepartment;
    @SerializedName("elapsedTime")
    private String mElapsedTime;
    @SerializedName("excerpt")
    private String mExcerpt;
    @SerializedName("excerptComments")
    private List<Object> mExcerptComments;
    @SerializedName("forumAlias")
    private String mForumAlias;
    @SerializedName("forumId")
    private String mForumId;
    @SerializedName("forumName")
    private String mForumName;
    @SerializedName("gender")
    private String mGender;
    @SerializedName("hidden")
    private Boolean mHidden;
    @SerializedName("id")
    private String mId;
    @SerializedName("isModerator")
    private Boolean mIsModerator;
    @SerializedName("isSuspiciousAccount")
    private Boolean mIsSuspiciousAccount;
    @SerializedName("layout")
    private String mLayout;
    @SerializedName("likeCount")
    private String mLikeCount;
    @SerializedName("media")
    private List<Medium> mMedia;
    @SerializedName("mediaMeta")
    private List<MediaMetum> mMediaMeta;
    @SerializedName("meta")
    private Meta mMeta;
    @SerializedName("nsfw")
    private Boolean mNsfw;
    @SerializedName("pinned")
    private Boolean mPinned;
    @SerializedName("postAvatar")
    private String mPostAvatar;
    @SerializedName("reactions")
    private List<Reaction> mReactions;
    @SerializedName("replyId")
    private Object mReplyId;
    @SerializedName("replyTitle")
    private Object mReplyTitle;
    @SerializedName("reportReasonText")
    private String mReportReasonText;
    @SerializedName("school")
    private String mSchool;
    @SerializedName("tags")
    private List<Object> mTags;
    @SerializedName("title")
    private String mTitle;
    @SerializedName("topics")
    private List<String> mTopics;
    @SerializedName("updatedAt")
    private String mUpdatedAt;
    @SerializedName("verifiedBadge")
    private Boolean mVerifiedBadge;
    @SerializedName("withImages")
    private Boolean mWithImages;
    @SerializedName("withNickname")
    private Boolean mWithNickname;
    @SerializedName("withVideos")
    private Boolean mWithVideos;

    public Boolean getAnonymousDepartment() {
        return mAnonymousDepartment;
    }

    public void setAnonymousDepartment(Boolean anonymousDepartment) {
        mAnonymousDepartment = anonymousDepartment;
    }

    public Boolean getAnonymousSchool() {
        return mAnonymousSchool;
    }

    public void setAnonymousSchool(Boolean anonymousSchool) {
        mAnonymousSchool = anonymousSchool;
    }

    public List<String> getCategories() {
        return mCategories;
    }

    public void setCategories(List<String> categories) {
        mCategories = categories;
    }

    public String getCommentCount() {
        return mCommentCount;
    }

    public void setCommentCount(String commentCount) {
        mCommentCount = commentCount;
    }

    public String getCreatedAt() {
        return mCreatedAt;
    }

    public void setCreatedAt(String createdAt) {
        mCreatedAt = createdAt;
    }

    public Object getCustomStyle() {
        return mCustomStyle;
    }

    public void setCustomStyle(Object customStyle) {
        mCustomStyle = customStyle;
    }

    public String getDepartment() {
        return mDepartment;
    }

    public void setDepartment(String department) {
        mDepartment = department;
    }

    public String getElapsedTime() {
        return mElapsedTime;
    }

    public void setElapsedTime(String elapsedTime) {
        mElapsedTime = elapsedTime;
    }

    public String getExcerpt() {
        return mExcerpt;
    }

    public void setExcerpt(String excerpt) {
        mExcerpt = excerpt;
    }

    public List<Object> getExcerptComments() {
        return mExcerptComments;
    }

    public void setExcerptComments(List<Object> excerptComments) {
        mExcerptComments = excerptComments;
    }

    public String getForumAlias() {
        return mForumAlias;
    }

    public void setForumAlias(String forumAlias) {
        mForumAlias = forumAlias;
    }

    public String getForumId() {
        return mForumId;
    }

    public void setForumId(String forumId) {
        mForumId = forumId;
    }

    public String getForumName() {
        return mForumName;
    }

    public void setForumName(String forumName) {
        mForumName = forumName;
    }

    public String getGender() {
        return mGender;
    }

    public void setGender(String gender) {
        mGender = gender;
    }

    public Boolean getHidden() {
        return mHidden;
    }

    public void setHidden(Boolean hidden) {
        mHidden = hidden;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public Boolean getIsModerator() {
        return mIsModerator;
    }

    public void setIsModerator(Boolean isModerator) {
        mIsModerator = isModerator;
    }

    public Boolean getIsSuspiciousAccount() {
        return mIsSuspiciousAccount;
    }

    public void setIsSuspiciousAccount(Boolean isSuspiciousAccount) {
        mIsSuspiciousAccount = isSuspiciousAccount;
    }

    public String getLayout() {
        return mLayout;
    }

    public void setLayout(String layout) {
        mLayout = layout;
    }

    public String getLikeCount() {
        return mLikeCount;
    }

    public void setLikeCount(String likeCount) {
        mLikeCount = likeCount;
    }

    public List<Medium> getMedia() {
        return mMedia;
    }

    public void setMedia(List<Medium> media) {
        mMedia = media;
    }

    public List<MediaMetum> getMediaMeta() {
        return mMediaMeta;
    }

    public void setMediaMeta(List<MediaMetum> mediaMeta) {
        mMediaMeta = mediaMeta;
    }

    public Meta getMeta() {
        return mMeta;
    }

    public void setMeta(Meta meta) {
        mMeta = meta;
    }

    public Boolean getNsfw() {
        return mNsfw;
    }

    public void setNsfw(Boolean nsfw) {
        mNsfw = nsfw;
    }

    public Boolean getPinned() {
        return mPinned;
    }

    public void setPinned(Boolean pinned) {
        mPinned = pinned;
    }

    public String getPostAvatar() {
        return mPostAvatar;
    }

    public void setPostAvatar(String postAvatar) {
        mPostAvatar = postAvatar;
    }

    public List<Reaction> getReactions() {
        return mReactions;
    }

    public void setReactions(List<Reaction> reactions) {
        mReactions = reactions;
    }

    public Object getReplyId() {
        return mReplyId;
    }

    public void setReplyId(Object replyId) {
        mReplyId = replyId;
    }

    public Object getReplyTitle() {
        return mReplyTitle;
    }

    public void setReplyTitle(Object replyTitle) {
        mReplyTitle = replyTitle;
    }

    public String getReportReasonText() {
        return mReportReasonText;
    }

    public void setReportReasonText(String reportReasonText) {
        mReportReasonText = reportReasonText;
    }

    public String getSchool() {
        return mSchool;
    }

    public void setSchool(String school) {
        mSchool = school;
    }

    public List<Object> getTags() {
        return mTags;
    }

    public void setTags(List<Object> tags) {
        mTags = tags;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
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

    public Boolean getVerifiedBadge() {
        return mVerifiedBadge;
    }

    public void setVerifiedBadge(Boolean verifiedBadge) {
        mVerifiedBadge = verifiedBadge;
    }

    public Boolean getWithImages() {
        return mWithImages;
    }

    public void setWithImages(Boolean withImages) {
        mWithImages = withImages;
    }

    public Boolean getWithNickname() {
        return mWithNickname;
    }

    public void setWithNickname(Boolean withNickname) {
        mWithNickname = withNickname;
    }

    public Boolean getWithVideos() {
        return mWithVideos;
    }

    public void setWithVideos(Boolean withVideos) {
        mWithVideos = withVideos;
    }

}

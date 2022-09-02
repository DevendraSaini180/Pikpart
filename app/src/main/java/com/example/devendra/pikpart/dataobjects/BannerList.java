
package com.example.devendra.pikpart.dataobjects;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class BannerList implements Serializable {

    @SerializedName("id")
    private String mId;
    @SerializedName("imageUrl")
    private String mImageUrl;
    @SerializedName("isMajorService")
    private Boolean mIsMajorService;
    @SerializedName("name")
    private String mName;

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public String getImageUrl() {
        return mImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        mImageUrl = imageUrl;
    }

    public Boolean getIsMajorService() {
        return mIsMajorService;
    }

    public void setIsMajorService(Boolean isMajorService) {
        mIsMajorService = isMajorService;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

}

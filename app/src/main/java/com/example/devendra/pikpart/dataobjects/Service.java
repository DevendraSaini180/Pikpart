
package com.example.devendra.pikpart.dataobjects;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Service implements Serializable {

    @SerializedName("id")
    private Long mId;
    @SerializedName("isMajorService")
    private Boolean mIsMajorService;
    @SerializedName("name")
    private String mName;
    @SerializedName("solidBgImg")
    private String mSolidBgImg;
    @SerializedName("typeId")
    private String mTypeId;
    @SerializedName("whiteBgImg")
    private String mWhiteBgImg;

    public Long getId() {
        return mId;
    }

    public void setId(Long id) {
        mId = id;
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

    public String getSolidBgImg() {
        return mSolidBgImg;
    }

    public void setSolidBgImg(String solidBgImg) {
        mSolidBgImg = solidBgImg;
    }

    public String getTypeId() {
        return mTypeId;
    }

    public void setTypeId(String typeId) {
        mTypeId = typeId;
    }

    public String getWhiteBgImg() {
        return mWhiteBgImg;
    }

    public void setWhiteBgImg(String whiteBgImg) {
        mWhiteBgImg = whiteBgImg;
    }

}

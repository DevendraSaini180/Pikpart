
package com.example.devendra.pikpart.dataobjects;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class NearByGarage implements Serializable {

    @SerializedName("brandUrl")
    private String mBrandUrl;
    @SerializedName("distance")
    private Double mDistance;
    @SerializedName("id")
    private Long mId;
    @SerializedName("imageUrl")
    private String mImageUrl;
    @SerializedName("isClose")
    private Boolean mIsClose;
    @SerializedName("latitude")
    private Double mLatitude;
    @SerializedName("longitude")
    private Double mLongitude;
    @SerializedName("name")
    private String mName;
    @SerializedName("rateRatio")
    private Long mRateRatio;

    public String getBrandUrl() {
        return mBrandUrl;
    }

    public void setBrandUrl(String brandUrl) {
        mBrandUrl = brandUrl;
    }

    public Double getDistance() {
        return mDistance;
    }

    public void setDistance(Double distance) {
        mDistance = distance;
    }

    public Long getId() {
        return mId;
    }

    public void setId(Long id) {
        mId = id;
    }

    public String getImageUrl() {
        return mImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        mImageUrl = imageUrl;
    }

    public Boolean getIsClose() {
        return mIsClose;
    }

    public void setIsClose(Boolean isClose) {
        mIsClose = isClose;
    }

    public Double getLatitude() {
        return mLatitude;
    }

    public void setLatitude(Double latitude) {
        mLatitude = latitude;
    }

    public Double getLongitude() {
        return mLongitude;
    }

    public void setLongitude(Double longitude) {
        mLongitude = longitude;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public Long getRateRatio() {
        return mRateRatio;
    }

    public void setRateRatio(Long rateRatio) {
        mRateRatio = rateRatio;
    }

}

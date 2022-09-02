
package com.example.devendra.pikpart.dataobjects;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class OfferOnAmc implements Serializable {

    @SerializedName("description")
    private String mDescription;
    @SerializedName("discountPercent")
    private Long mDiscountPercent;
    @SerializedName("id")
    private Long mId;
    @SerializedName("imageUrl")
    private String mImageUrl;
    @SerializedName("name")
    private String mName;

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public Long getDiscountPercent() {
        return mDiscountPercent;
    }

    public void setDiscountPercent(Long discountPercent) {
        mDiscountPercent = discountPercent;
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

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

}

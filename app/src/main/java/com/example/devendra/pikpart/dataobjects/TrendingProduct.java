
package com.example.devendra.pikpart.dataobjects;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.SerializedName;

public class TrendingProduct implements Serializable {

    @SerializedName("attributes")
    private List<String> mAttributes;
    @SerializedName("discount")
    private Long mDiscount;
    @SerializedName("id")
    private Long mId;
    @SerializedName("imageUrl")
    private String mImageUrl;
    @SerializedName("isEcom")
    private Boolean mIsEcom;
    @SerializedName("name")
    private String mName;

    public List<String> getAttributes() {
        return mAttributes;
    }

    public void setAttributes(List<String> attributes) {
        mAttributes = attributes;
    }

    public Long getDiscount() {
        return mDiscount;
    }

    public void setDiscount(Long discount) {
        mDiscount = discount;
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

    public Boolean getIsEcom() {
        return mIsEcom;
    }

    public void setIsEcom(Boolean isEcom) {
        mIsEcom = isEcom;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

}

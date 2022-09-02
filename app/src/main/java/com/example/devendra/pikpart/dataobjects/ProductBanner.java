
package com.example.devendra.pikpart.dataobjects;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class ProductBanner implements Serializable {

    @SerializedName("imageUrl")
    private String mImageUrl;
    @SerializedName("name")
    private String mName;

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

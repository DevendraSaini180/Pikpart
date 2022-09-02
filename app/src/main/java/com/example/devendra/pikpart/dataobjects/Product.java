
package com.example.devendra.pikpart.dataobjects;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Product implements Serializable {

    @SerializedName("productArray")
    private List<ProductArray> mProductArray;
    @SerializedName("productBanner")
    private List<ProductBanner> mProductBanner;

    public List<ProductArray> getProductArray() {
        return mProductArray;
    }

    public void setProductArray(List<ProductArray> productArray) {
        mProductArray = productArray;
    }

    public List<ProductBanner> getProductBanner() {
        return mProductBanner;
    }

    public void setProductBanner(List<ProductBanner> productBanner) {
        mProductBanner = productBanner;
    }

}

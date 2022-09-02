package com.example.devendra.pikpart.dataobjects;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class ProductsRequest implements Serializable {

    @SerializedName("objectHash")
    @Expose
    private ObjectHash objectHash;

    @SerializedName("queryParamHash")
    @Expose
    private QueryParamHash queryParamHash;

    public ObjectHash getObjectHash() {
        return objectHash;
    }

    public void setObjectHash(ObjectHash objectHash) {
        this.objectHash = objectHash;
    }

    public QueryParamHash getQueryParamHash() {
        return queryParamHash;
    }

    public void setQueryParamHash(QueryParamHash queryParamHash) {
        this.queryParamHash = queryParamHash;
    }

}

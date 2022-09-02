package com.example.devendra.pikpart.dataobjects;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class ProductsResponse implements Serializable {

    @SerializedName("responseMsg")
    private ResponseMsg mResponseMsg;

    @SerializedName("responseResult")
    private ResponseResult mResponseResult;

    public ResponseMsg getResponseMsg() {
        return mResponseMsg;
    }

    public void setResponseMsg(ResponseMsg responseMsg) {
        mResponseMsg = responseMsg;
    }

    public ResponseResult getResponseResult() {
        return mResponseResult;
    }

    public void setResponseResult(ResponseResult responseResult) {
        mResponseResult = responseResult;
    }

}

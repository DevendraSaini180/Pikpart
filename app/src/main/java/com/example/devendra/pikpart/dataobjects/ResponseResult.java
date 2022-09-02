
package com.example.devendra.pikpart.dataobjects;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class ResponseResult implements Serializable {

    @SerializedName("result")
    private Result mResult;

    public Result getResult() {
        return mResult;
    }

    public void setResult(Result result) {
        mResult = result;
    }

}

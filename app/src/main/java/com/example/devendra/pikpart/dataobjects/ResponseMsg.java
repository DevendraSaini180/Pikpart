
package com.example.devendra.pikpart.dataobjects;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class ResponseMsg implements Serializable {

    @SerializedName("isError")
    private Boolean mIsError;
    @SerializedName("isWarning")
    private Boolean mIsWarning;
    @SerializedName("responseMsOther")
    private ResponseMsOther mResponseMsOther;

    public Boolean getIsError() {
        return mIsError;
    }

    public void setIsError(Boolean isError) {
        mIsError = isError;
    }

    public Boolean getIsWarning() {
        return mIsWarning;
    }

    public void setIsWarning(Boolean isWarning) {
        mIsWarning = isWarning;
    }

    public ResponseMsOther getResponseMsOther() {
        return mResponseMsOther;
    }

    public void setResponseMsOther(ResponseMsOther responseMsOther) {
        mResponseMsOther = responseMsOther;
    }

}

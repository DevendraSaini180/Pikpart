
package com.example.devendra.pikpart.dataobjects;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class ResponseMsOther implements Serializable {

    @SerializedName("msgArray")
    private String mMsgArray;

    public String getMsgArray() {
        return mMsgArray;
    }

    public void setMsgArray(String msgArray) {
        mMsgArray = msgArray;
    }

}

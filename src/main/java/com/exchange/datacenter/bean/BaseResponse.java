package com.exchange.datacenter.bean;


import java.util.List;

public class BaseResponse<T> {

    private String errorCode = "00000";

    private String message;

    private List<T> data;

    public static BaseResponse responseOf(String errorCode,String message){
        BaseResponse response = new BaseResponse<>();
        response.errorCode = errorCode;
        response.message = message;
        return response;
    }

    public static <T> BaseResponse responseOf(List<T> data){
        BaseResponse<T> response = new BaseResponse<T>();
        response.data = data;
        return response;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}

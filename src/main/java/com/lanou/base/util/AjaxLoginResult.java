package com.lanou.base.util;




/**
 * Created by dllo on 17/11/8.
 */
public class AjaxLoginResult<T> {

    private int errorCode;//响应码
    private String message;//当返回错误时,给出错误提示
    private T data;// 用户对象

    public AjaxLoginResult() {
    }

    public AjaxLoginResult(int errorCode, T data) {
        this.errorCode = errorCode;
        this.data = data;
    }

    public AjaxLoginResult(int errorCode, String message) {
        this.errorCode = errorCode;
        this.message = message;
    }

    public AjaxLoginResult(int errorCode, String message, T data) {
        this.errorCode = errorCode;
        this.message = message;
        this.data = data;
    }

    @Override
    public String toString() {
        return "AjaxLoginResult{" +
                "errorCode=" + errorCode +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

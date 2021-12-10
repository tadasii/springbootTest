package com.zz.vo;

public class CommonResult<T> {
    /**
     * 响应码 00成功 99失败
     */
    private String code;
    /**
     * 消息
     */
    private String message;
    /**
     * 数据
     */
    private T data;


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

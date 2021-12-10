package com.zz.vo;

public enum ResultCode {
    成功(0,"成功"),失败(99,"失败");
    private int code;
    private String message;

    ResultCode(int code, String message) {
        this.code = code;
        this.message = message;
    }
}

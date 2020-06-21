package com.myking520.doraemon.codegeneration.infrastructure.result;

public class ApiResult<T> {
    private int code;
    private String msg;
    private T data;

    public static ApiResult sucess() {
        return new ApiResult();
    }

    public T getData(){
        return data;
    }
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setData(T data) {
        this.data = data;
    }
}

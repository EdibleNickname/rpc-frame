package com.can.response;

import java.io.Serializable;

/**
 * Description:
 *
 * @Author LCN
 * @Date 2018-04-24 下午 04:23
 */
public class Response<T> implements Serializable {

    private T result;
    private String msg = "200";

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
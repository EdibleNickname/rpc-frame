package com.can.request;

import java.io.Serializable;

/**
 * Description:
 *
 * @Author LCN
 * @Date 2018-04-24 下午 04:23
 */
public class DemoRequest implements Serializable {

    private String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}

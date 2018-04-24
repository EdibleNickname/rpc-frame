package com.can.request;

import java.io.Serializable;

/**
 * Description:
 *
 * @Author LCN
 * @Date 2018-04-11 下午 09:00
 */

public class UserInfoRequest implements Serializable {

    private String userName;
    private Integer userAge;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }
}

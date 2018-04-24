package com.can.response.dto;

import java.io.Serializable;

/**
 * Description:
 *
 * @Author LCN
 * @Date 2018-04-11 下午 09:07
 */
public class UserInfoDto implements Serializable {

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

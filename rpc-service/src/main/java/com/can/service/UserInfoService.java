package com.can.service;

import com.can.model.UserInfoDO;

/**
 * Description:
 *
 * @Author LCN
 * @Date 2018-04-24 下午 08:32
 */
public interface UserInfoService {

    /**
     *  添加一条用户信息
     * @param userInfo
     * @return
     */
    Boolean addUser(UserInfoDO userInfo);

    /**
     * 通过id查询用户信息
     * @param id
     * @return
     */
    UserInfoDO getUser(Long id);

}

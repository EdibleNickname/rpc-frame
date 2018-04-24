package com.can.service.impl;

import com.can.dao.UserInfoDao;
import com.can.model.UserInfoDO;
import com.can.service.UserInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Description:
 *
 * @Author LCN
 * @Date 2018-04-24 下午 08:33
 */

@Service
public class UserInfoServiceImpl implements UserInfoService {

    private Logger log = LoggerFactory.getLogger(UserInfoServiceImpl.class);

    @Resource
    private UserInfoDao userInfoDao;

    @Override
    public Boolean addUser(UserInfoDO userInfo) {

        log.info("收到的信息是{},{}", userInfo.getUserName(), userInfo.getUserAge());

        int num = userInfoDao.insert(userInfo);
        if (num == 1) {
            return true;
        }
        return false;
    }

    @Override
    public UserInfoDO getUser(Long id) {

        log.info("返回的参数为------>{}", id);

        UserInfoDO userInfoDO = userInfoDao.selectByPrimaryKey(id);
        log.info("返回的用户名为------>{}", userInfoDO.getUserName());

        return userInfoDO;
    }
}

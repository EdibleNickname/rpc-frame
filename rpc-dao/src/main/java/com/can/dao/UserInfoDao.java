package com.can.dao;

import com.can.model.UserInfoDO;

/**
 * Description:
 *
 * @Author LCN
 * @Date 2018-04-24 下午 08:20
 */
public interface UserInfoDao {

    int deleteByPrimaryKey(Long id);

    int insert(UserInfoDO record);

    int insertSelective(UserInfoDO record);

    UserInfoDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserInfoDO record);

    int updateByPrimaryKey(UserInfoDO record);

}


package com.can.impl;

import com.can.model.UserInfoDO;
import com.can.provider.UserInfoProvider;
import com.can.request.UserInfoRequest;
import com.can.response.Response;
import com.can.response.dto.UserInfoDto;
import com.can.service.UserInfoService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Description:
 *
 * @Author LCN
 * @Date 2018-04-24 下午 08:37
 */

@Component
public class UserInfoProviderImpl implements UserInfoProvider {

    @Resource
    private UserInfoService userInfoService;

    @Override
    public Response<Boolean> addUser(UserInfoRequest request) {

        UserInfoDO userInfo = new UserInfoDO();
        BeanUtils.copyProperties(request, userInfo);

        boolean result = userInfoService.addUser(userInfo);
        Response<Boolean> response = new Response<>();
        response.setResult(result);

        return response;
    }

    @Override
    public Response<UserInfoDto> getUser(Long id) {

        UserInfoDO userInfo = userInfoService.getUser(id);

        UserInfoDto userInfoDto = new UserInfoDto();
        BeanUtils.copyProperties(userInfo, userInfoDto);
        Response<UserInfoDto> response = new Response<>();
        response.setResult(userInfoDto);

        return response;
    }

}

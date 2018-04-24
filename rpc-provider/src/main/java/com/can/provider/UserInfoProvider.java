package com.can.provider;

import com.can.request.UserInfoRequest;
import com.can.response.Response;
import com.can.response.dto.UserInfoDto;

/**
 * Description:
 *
 * @Author LCN
 * @Date 2018-04-24 下午 08:49
 */
public interface UserInfoProvider {

    Response<Boolean> addUser(UserInfoRequest request);

    Response<UserInfoDto> getUser(Long id);

}

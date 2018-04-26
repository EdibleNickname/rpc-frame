package com.can.impl;

import com.can.json.JsonUtil;
import com.can.provider.UserInfoProvider;
import com.can.request.UserInfoRequest;
import com.can.response.Response;
import com.can.response.dto.UserInfoDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import javax.annotation.Resource;

/**
 * Description:
 *
 * @Author LCN
 * @Date 2018-04-24 下午 08:43
 */

@ContextConfiguration(locations = {"classpath:applicationContext-base.xml"})
public class UserInfoProviderImplTest extends AbstractTestNGSpringContextTests {

    private Logger log  = LoggerFactory.getLogger(UserInfoProviderImplTest.class);

    @Resource
    private UserInfoProvider userInfoProvider;

    @Test
    public void testAddUser() {
        UserInfoRequest request = new UserInfoRequest();
        request.setUserAge(23);
        request.setUserName("LCX");
        Response<Boolean> response = userInfoProvider.addUser(request);
        log.info("返回结果为---------------->{}", JsonUtil.getInstance().writeJson(response));
    }

    @Test
    public void testGetUser() {
        Long id = 1L;
        Response<UserInfoDto> response = userInfoProvider.getUser(id);
        log.info("返回结果为---------------->{}", JsonUtil.getInstance().writeJson(response));
    }

}

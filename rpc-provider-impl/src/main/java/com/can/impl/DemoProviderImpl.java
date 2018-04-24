package com.can.impl;

import com.can.provider.DemoProvider;
import com.can.request.DemoRequest;
import com.can.response.Response;
import com.can.service.DemoService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Description:
 *
 * @Author LCN
 * @Date 2018-04-24 下午 04:49
 */

@Component
public class DemoProviderImpl implements DemoProvider{

    @Resource
    private DemoService demoService;

    @Override
    public Response<String> repeat(DemoRequest request) {
        String str = request.getStr();
        System.out.println("providerImpl收到消息----->"+str);
        String responseStr = demoService.repeat(str);
        Response<String> response = new Response<>();
        response.setResult(str);
        return response;
    }

}

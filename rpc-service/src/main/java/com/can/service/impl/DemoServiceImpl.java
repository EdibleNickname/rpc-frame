package com.can.service.impl;

import com.can.service.DemoService;
import org.springframework.stereotype.Service;

/**
 * Description:
 *
 * @Author LCN
 * @Date 2018-04-24 下午 04:42
 */

@Service
public class DemoServiceImpl implements DemoService {

    @Override
    public String repeat(String str) {
        System.out.println("service层收到消息--->"+str);
        return str;
    }
}

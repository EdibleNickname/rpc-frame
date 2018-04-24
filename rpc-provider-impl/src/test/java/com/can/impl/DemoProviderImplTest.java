package com.can.impl;

import com.can.provider.DemoProvider;
import com.can.request.DemoRequest;
import com.can.response.Response;
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
 * @Date 2018-04-24 下午 05:04
 */
@ContextConfiguration(locations = {"classpath:applicationContext-base.xml"})
public class DemoProviderImplTest extends AbstractTestNGSpringContextTests {

    private Logger log  = LoggerFactory.getLogger(DemoProviderImplTest.class);

    @Resource
    private DemoProvider demoProvider;

    @Test
    public void testRepeat() {
        DemoRequest request = new DemoRequest();
        request.setStr("我是测试字符串");
        Response<String> response = demoProvider.repeat(request);

        log.info("调用方收到的数据---------->{}", response.getResult());
    }

}

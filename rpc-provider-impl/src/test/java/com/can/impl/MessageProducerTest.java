package com.can.impl;

import com.can.queue.producer.MessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

/**
 * Description: 测试rabbit的发送消息功能
 *
 * @Author LCN
 * @Date 2018-04-25 上午 08:35
 */
@ContextConfiguration(locations = {"classpath:applicationContext-base.xml"})
public class MessageProducerTest extends AbstractTestNGSpringContextTests {

    @Autowired
    private MessageProducer messageProducer;

    @Test
    public void testSendMessage() {
        messageProducer.sendMessage("rpc-frame");
    }
}

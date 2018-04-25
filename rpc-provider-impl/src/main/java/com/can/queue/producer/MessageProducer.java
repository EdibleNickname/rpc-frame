package com.can.queue.producer;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Description:
 *
 * @Author LCN
 * @Date 2018-04-24 下午 09:56
 */

@Component
public class MessageProducer {

    @Autowired
    private RabbitTemplate template;

    public void sendMessage(String content) {
        template.convertAndSend("myExchange","first.producer",content);
    }

}

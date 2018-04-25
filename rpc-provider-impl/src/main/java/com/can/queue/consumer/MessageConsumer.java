package com.can.queue.consumer;

import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.ChannelAwareMessageListener;
import org.springframework.stereotype.Component;

/**
 * Description:
 *
 * @Author LCN
 * @Date 2018-04-24 下午 09:55
 */

@Component
public class MessageConsumer implements ChannelAwareMessageListener {

    @Override
    public void onMessage(Message message, Channel channel) throws Exception {
        String srt2 = new String(message.getBody(), "UTF-8");
        System.out.println("消费者收到消息：" + srt2);
    }

}

package com.can;

import com.alibaba.dubbo.common.logger.Logger;
import com.alibaba.dubbo.common.logger.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Description:
 *
 * @Author LCN
 * @Date 2018-04-24 下午 04:47
 */
public class ApplicationStarter {

    private final static Logger log = LoggerFactory.getLogger(ApplicationStarter.class);
    private static volatile boolean running = true;

    public static void main(String[] args) {
        try {

            log.info("服务开启中.....");

            ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                    new String[]{"applicationContext-base.xml"});

            ((AbstractApplicationContext) applicationContext).registerShutdownHook();

            Runtime.getRuntime().addShutdownHook(new Thread() {
                @Override
                public void run() {
                    log.info("服务开启失败 !");
                    synchronized (ApplicationStarter.class) {
                        running = false;
                        ApplicationStarter.class.notify();
                    }
                }
            });

            log.info("服务开启成功！");

            synchronized (ApplicationStarter.class) {
                while (running) {
                    try {
                        ApplicationStarter.class.wait();
                    } catch (Throwable e) {
                        log.error(e.getMessage(),e);
                    }
                }
            }

        }catch (Exception e){
            log.error("服务异常关闭---->{}", e);
            System.exit(0);
        }
    }
}

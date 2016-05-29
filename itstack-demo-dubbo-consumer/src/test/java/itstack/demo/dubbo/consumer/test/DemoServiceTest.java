package itstack.demo.dubbo.consumer.test;

import itstack.demo.dubbo.provider.service.DemoService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by fuzhengwei on 2016/5/29.
 */
public class DemoServiceTest {

    @Test
    public void test_start() throws Exception{

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "spring-config.xml" });
        context.start();

        DemoService demoService = (DemoService) context.getBean("demoService");
        String hello = demoService.sayHello("tom");
        System.out.println(hello);

        List list = demoService.getUsers();
        if (list != null && list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
        }

        System.in.read();
    }

}

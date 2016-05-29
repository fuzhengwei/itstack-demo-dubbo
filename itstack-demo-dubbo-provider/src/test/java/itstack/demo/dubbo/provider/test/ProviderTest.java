package itstack.demo.dubbo.provider.test;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by fuzhengwei on 2016/5/29.
 */
public class ProviderTest {

    @Test
    public void test_start() throws Exception{
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{
                        "spring-config.xml"});
        context.start();

        //保持住不动
        System.in.read();
    }

}

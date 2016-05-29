package itstack.demo.dubbo.provider.service;

import java.util.List;

/**
 * Created by fuzhengwei on 2016/5/29.
 */
public interface DemoService {

    String sayHello(String name);

    public List getUsers();

}

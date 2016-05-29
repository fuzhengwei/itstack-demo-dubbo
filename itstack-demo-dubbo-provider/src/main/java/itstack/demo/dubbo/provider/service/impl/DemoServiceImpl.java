package itstack.demo.dubbo.provider.service.impl;

import itstack.demo.dubbo.provider.domain.User;
import itstack.demo.dubbo.provider.service.DemoService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fuzhengwei on 2016/5/29.
 */
@Service("DemoService")
public class DemoServiceImpl implements DemoService {

    public String sayHello(String name) {
        return "Hello " + name;
    }

    public List getUsers() {
        List list = new ArrayList();
        User u1 = new User();
        u1.setName("jack");
        u1.setAge(20);
        u1.setSex("m");

        User u2 = new User();
        u2.setName("tom");
        u2.setAge(21);
        u2.setSex("m");

        User u3 = new User();
        u3.setName("rose");
        u3.setAge(19);
        u3.setSex("w");

        list.add(u1);
        list.add(u2);
        list.add(u3);
        return list;
    }
}

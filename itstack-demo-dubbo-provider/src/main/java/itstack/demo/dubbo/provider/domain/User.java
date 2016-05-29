package itstack.demo.dubbo.provider.domain;

import java.io.Serializable;

/**
 * Created by fuzhengwei on 2016/5/29.
 */
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private int age;
    private String name;
    private String sex;

    public User() {
        super();
    }

    public User(int age, String name, String sex) {
        super();
        this.age = age;
        this.name = name;
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

}

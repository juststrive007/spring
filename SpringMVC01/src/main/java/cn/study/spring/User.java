package cn.study.spring;

import org.springframework.stereotype.Component;

@Component
public class User {
    public User(){
        System.out.println("创建User类的对象");
    }
}

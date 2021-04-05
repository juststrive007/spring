package cn.study.spring;

import org.springframework.stereotype.Component;

@Component
public class UserDao {
    public void login(){
        System.out.println("UserDao.login()");
    }
}

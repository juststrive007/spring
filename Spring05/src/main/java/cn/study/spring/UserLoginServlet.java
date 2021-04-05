package cn.study.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserLoginServlet {

    @Autowired
    public UserDao userDao;



    public void doPost(){
        System.out.println("UserLoginServlet.doPost()");
        userDao.login();
    }
}

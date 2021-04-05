package cn.study.spring;

public class UserLoginServlet {
    public UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void doPost(){
        System.out.println("UserLoginServlet.doPost()");
        userDao.login();
    }
}

package cn.study.spring;

/**
 * 用户登录类
 * @author wm
 */
public class UserLoginServlet {
    public UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}

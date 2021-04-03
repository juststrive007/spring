package cn.study.spring;

public class UserDaoFactory {
    public UserDao newInstance(){
        return new UserDao(null);
    }
}

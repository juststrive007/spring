package cn.study.mybatis;

import org.apache.commons.dbcp.BasicDataSource;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;
import java.sql.SQLException;

public class Tests {
    ClassPathXmlApplicationContext ac;
    UserMapper userMapper;

    @Test
    public void getConnection() throws SQLException {
        BasicDataSource dataSource=(BasicDataSource) ac.getBean("dataSource");
        Connection conn=dataSource.getConnection();
        System.out.println(conn);
    }

    @Test
    public void addnew(){
        User user=new User();
        user.setUsername("wangmeng");
        user.setAge(25);
        user.setEmail("juststrive007@gmail.com");
        user.setPassword("123456");
        user.setPhone("12345678901");

        Integer integer = userMapper.addnew(user);
        System.out.println("int:" +integer);
    }

    @Before
    public void doBefore(){
        ac = new ClassPathXmlApplicationContext(
                "spring-dao.xml");
        userMapper = ac.getBean("userMapper",UserMapper.class);
    }

    @After
    public void doAfter(){
        ac.close();
    }
}

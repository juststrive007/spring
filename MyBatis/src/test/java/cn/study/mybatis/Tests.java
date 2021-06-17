package cn.study.mybatis;

import org.apache.commons.dbcp.BasicDataSource;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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

    @Test
    public void deletebyId(){
        Integer id=1;
        Integer rows = userMapper.deleteById(id);
        System.out.println("rows"+rows);
    }
    @Test
    public void deleteByIds(){
        List<Integer> ids = new ArrayList<>();
        ids.add(1);
        ids.add(2);
        Integer rows = userMapper.deleteByIds(ids);
        System.out.println("rows:"+rows);
    }

    @Test
    public void updatepassword(){
        String password="wangmeng";
        Integer rows = userMapper.updatePassword(password);
        System.out.println("rows"+rows);
    }

    @Test
    public void updateEmailById(){
        String email="juststrive@gmail.com";
        Integer rows = userMapper.updateEmailById(1,email);
        System.out.println(rows);
    }

    @Test
    public void count(){
        Integer rows = userMapper.count();
        System.out.println("rows"+rows);
    }

    @Test
    public void findById(){
        User user = userMapper.findById(1);
        System.out.println(user);
    }

    @Test
    public  void findAll(){
        List<User> users = userMapper.findAll();
        System.out.println("user number"+users.size());
        for(User u :users   ) {
            System.out.println(u);
        }

    }

    @Test
    public void findOld(){
        User olduser= userMapper.findOld();
        System.out.println(olduser);
    }

    @Test
    public void findVOById(){
        UserVO userVO = userMapper.findVOByid(1);
        System.out.println(userVO);
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

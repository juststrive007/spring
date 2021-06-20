package cn.study.sample;

import cn.study.sample.entity.User;
import cn.study.sample.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserMapperTest {
    @Autowired
    UserMapper userMapper;

    @Test
    public void insert(){
        User user=new User();
        user.setUsername("wangmeng1");
        user.setAge(100);
        user.setPassword("wangmeng");
        user.setPhone("11111111");
        userMapper.insert(user);

    }

    @Test
    public void selectByName(){
        User user=userMapper.findByUsername("wangmeng1");
        System.out.println(user);
    }

    @Test
    public void reg(){
        User user=new User();
        user.setUsername("wangmeng1");
        user.setPassword("wang");
        User result = userMapper.findByUsername(user.getUsername());
        if(result == null){
            userMapper.insert(user);
            System.out.println("注册成功！");
        }else{
            System.out.println("注册失败，用户已存在！");
        }
    }
}

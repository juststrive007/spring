package cn.study.spring;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

//package cn.study.spring02;
public class Tests {
    //测试方法的声明
    //1.必须添加@Test注解
    //2.必须使用public权限
    //3.必须使用void作为返回值类型
    //4.必须没有参数

    private ClassPathXmlApplicationContext ac;

    @Before
    public void doBefore(){
        //1.加载Spring配置文件，获取Spring容器
        ac=new ClassPathXmlApplicationContext(
                "applicationContext.xml");
    }

    @Test
    public void test(){
        UserLoginServlet userLoginServlet=ac.getBean("userLoginServlet",UserLoginServlet.class);
//        System.out.println(userLoginServlet);
//        System.out.println(userLoginServlet.userDao);
        userLoginServlet.doPost();
    }

    @After
    public void doAfter(){
        //4.释放
        ac.close();
    }

}

package cn.study.spring;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
    public void getBean(){
        //2.从Spring容器中获取对象
        User user=ac.getBean("user",User.class);
        //3.测试
        System.out.println(user);
        System.out.println(user.name);
        System.out.println(user.age);
        System.out.println(user.from);
    }

    @After
    public void doAfter(){
        //4.释放
        ac.close();
    }

}

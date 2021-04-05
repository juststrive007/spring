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
    public void getBean(){
        //2.从Spring容器中获取对象
        User user=ac.getBean("user",User.class);
        //3.测试
        System.out.println(user);
        System.out.println(user.name);
        System.out.println(user.age);
        System.out.println(user.from);
    }
    @Test
    public void testRef(){
        UserLoginServlet userLoginServlet =
                ac.getBean("userLoginServlet",UserLoginServlet.class);
        //测试
        System.out.println(userLoginServlet);
        System.out.println(userLoginServlet.userDao);

    }
    @Test
    public void testConstructor(){
        Person person=ac.getBean("person",Person.class);
        System.out.println(person);
        System.out.println(person.from);
    }

    @Test
    public void testStudent(){
        Student student=ac.getBean("student",Student.class);
        System.out.println(student);
    }


    @Test
    public void testSampleBean(){
        SampleBean sampleBean=ac.getBean("sampleBean",SampleBean.class);
        System.out.println(sampleBean.names);
        System.out.println(sampleBean.cities);
        System.out.println(Arrays.toString(sampleBean.skills));
        System.out.println(sampleBean.session);
        System.out.println(sampleBean.tools);

        System.out.println(sampleBean.jdbcConfig.getClass());
        System.out.println(sampleBean.jdbcConfig);

        System.out.println("url:"+sampleBean.jdbcConfig.get("url"));
        System.out.println("drive:"+sampleBean.jdbcConfig.get("drive"));
        System.out.println("Username:"+sampleBean.jdbcConfig.get("username"));
        System.out.println("Password:"+sampleBean.jdbcConfig.get("password"));


    }

    @Test
    public void testSpringEl(){
        ValueBean valueBean=ac.getBean("valueBean",ValueBean.class);
        System.out.println(valueBean.name);
        System.out.println(valueBean.username);
        System.out.println(valueBean.from);
        System.out.println(valueBean.password);
    }


    @After
    public void doAfter(){
        //4.释放
        ac.close();
    }

}

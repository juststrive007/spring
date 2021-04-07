package cn.study.spring;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tests {
    private ClassPathXmlApplicationContext ac;

    @Before
    public void doBefore(){
        ac=new ClassPathXmlApplicationContext("applicationContext.xml");
    }
    @Test
    public void testDispachter(){
//        User user=ac.getBean()
    }

    @After
    public void doAfter(){
        ac.close();
    }
}

package cn.study.mybatis;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DepartmentVOTest {
    ClassPathXmlApplicationContext ac;
    DepartmentMapper departmentMapper ;

    @Test
    public void findVOBYID(){
        DepartmentVO departmentVO =  departmentMapper.fineVOById(1);
        System.out.println(departmentVO);
    }
    @Before
    public void doBefore(){
        ac = new ClassPathXmlApplicationContext(
                "spring-dao.xml");
        departmentMapper = ac.getBean("departmentMapper",DepartmentMapper.class);
    }



    @After
    public void doAfter(){
        ac.close();
    }
}

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

    @Test
    public void getConnection() throws SQLException {
        BasicDataSource dataSource=(BasicDataSource) ac.getBean("dataSource");
        Connection conn=dataSource.getConnection();
        System.out.println(conn);
    }

    @Before
    public void doBefore(){
        ac = new ClassPathXmlApplicationContext(
                "spring-dao.xml");

    }
    @After
    public void doAfter(){
        ac.close();
    }
}

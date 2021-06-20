package cn.study.sample;

import cn.study.sample.entity.User;
import cn.study.sample.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;


@SpringBootTest
class SampleApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    DataSource datasource;

    @Test
    public void getConnection() throws SQLException {
        Connection con = datasource.getConnection();
        System.out.println(con);
    }





}

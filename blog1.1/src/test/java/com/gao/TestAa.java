package com.gao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

//@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class TestAa {

    @Autowired
    DataSource dataSource;

    public static void main(String[] args) {
        SpringApplication.run(TestAa.class, args);
    }

    @Test
    public void contextLoads() throws SQLException {
        Connection connection = dataSource.getConnection();
        System.out.println(connection.getMetaData().getURL());
        System.out.println(connection);
        connection.close();
    }



}
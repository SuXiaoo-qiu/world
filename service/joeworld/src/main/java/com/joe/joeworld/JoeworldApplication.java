package com.joe.joeworld;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@ComponentScan(basePackages = {"com.joe"})
@SpringBootApplication
public class JoeworldApplication {

    public static void main(String[] args) {
        SpringApplication.run(JoeworldApplication.class, args);
    }

}

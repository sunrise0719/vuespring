package com.test.vuespringtest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.test.vuespringtest.mapper")
public class VuespringtestApplication {

    public static void main(String[] args) {
        SpringApplication.run(VuespringtestApplication.class, args);

    }

}

package com.qsf.druiddemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.qsf.druiddemo.mapper")
public class DruiddemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DruiddemoApplication.class, args);
    }

}

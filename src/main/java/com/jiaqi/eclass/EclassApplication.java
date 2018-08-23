package com.jiaqi.eclass;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jiaqi.eclass.mapper")
public class EclassApplication {

    public static void main(String[] args) {
        SpringApplication.run(EclassApplication.class, args);
    }
}

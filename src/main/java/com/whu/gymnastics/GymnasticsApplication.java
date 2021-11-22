package com.whu.gymnastics;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.whu.gymnastics.mapper")
public class GymnasticsApplication {

    public static void main(String[] args) {
        SpringApplication.run(GymnasticsApplication.class, args);
    }

}

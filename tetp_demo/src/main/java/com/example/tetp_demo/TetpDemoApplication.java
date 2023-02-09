package com.example.tetp_demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//新添加代码—hx—1
@MapperScan("com.example.tetp_demo.hxmapper")
//添加结束-hx-1
public class TetpDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(TetpDemoApplication.class, args);
    }

}

package com.wqa.qiaicodefather;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wqa.qiaicodefather.mapper")
public class QiAiCodeFatherApplication {

    public static void main(String[] args) {
        SpringApplication.run(QiAiCodeFatherApplication.class, args);
    }

}

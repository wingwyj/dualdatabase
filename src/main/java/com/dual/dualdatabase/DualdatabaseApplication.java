package com.dual.dualdatabase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class DualdatabaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(DualdatabaseApplication.class, args);
    }

}

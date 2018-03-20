package com.henan.h3c.solution.platform.ca.server.util;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan( basePackages = {"com.henan.h3c.solution.platform"})
@EnableAutoConfiguration
public class TestUtil {
    public static void main(String[] args) {
        SpringApplication.run(TestUtil.class, args);
    }

    public static int add(int a, int b){
        return a + b;
    }
}

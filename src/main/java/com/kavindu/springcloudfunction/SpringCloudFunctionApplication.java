package com.kavindu.springcloudfunction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class SpringCloudFunctionApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudFunctionApplication.class, args);
    }

    @Bean
    public Function<String, String> reverseString() {
        return value -> new StringBuilder(value).reverse().toString();
    }

    @Bean
    public Function<String, String> hi() {
        return value-> "hello world";
    }
}
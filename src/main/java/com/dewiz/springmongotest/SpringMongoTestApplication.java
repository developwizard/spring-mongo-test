package com.dewiz.springmongotest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SpringMongoTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMongoTestApplication.class, args);
    }

}

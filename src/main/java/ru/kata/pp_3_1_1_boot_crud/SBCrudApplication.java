package ru.kata.pp_3_1_1_boot_crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class SBCrudApplication extends SpringBootServletInitializer{

    public static void main(String[] args) {
        SpringApplication.run(SBCrudApplication.class, args);
    }

}

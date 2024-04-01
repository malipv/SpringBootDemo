package ru.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication(scanBasePackages = "ru.project")
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Main.class, args);
        DepartmentRepo dr = ctx.getBean(DepartmentRepo.class);
        System.out.println(ctx);
        //System.out.println(dr.findAll());
    }
}

//spring data JDBC
package ru.project;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext("ru.project");
        DepartmentRepo dr = ctx.getBean(DepartmentRepo.class);
        System.out.println(ctx);
        System.out.println(dr.findAll());
    }
}

//spring data JDBC
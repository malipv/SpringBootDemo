package ru.project;

import org.springframework.data.annotation.Id;

public class Department {
    @Id long id;
    String name;

    @Override
    public String toString() {
        return "Department{" + "id=" + id + ", name=" + name +  "}";
    }
}

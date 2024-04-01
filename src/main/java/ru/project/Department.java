package ru.project;

import org.
public class Department {
    @Id long id;
    String name;

    @Override
    public String toString() {
        return "Department{" + "id=" + id + ", name=" + name +  "}";
    }
}

package ru.project;

import org.springframework.data.repository.CrudRepository;

public interface DepartmentRepo extends CrudRepository<Department, Long> {
}

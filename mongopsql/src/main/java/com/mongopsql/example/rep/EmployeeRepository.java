package com.mongopsql.example.rep;

import com.mongopsql.example.models.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee,Long> {
}

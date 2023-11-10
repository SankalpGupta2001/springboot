package com.mongopsql.example.rep;

import com.mongopsql.example.models.Department;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DepartmentRepository extends MongoRepository<Department,String> {
}

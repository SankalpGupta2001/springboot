package com.mongopsql.example.controller;

import com.mongopsql.example.models.Department;
import com.mongopsql.example.rep.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/depart")
public class MyDepartmentController {

    @Autowired
    private DepartmentRepository departmentRepository;
    @PostMapping("/add")
    public ResponseEntity<?> addDepartment(@RequestBody Department department){
        Department save=this.departmentRepository.save(department);
        return ResponseEntity.ok(save);
    }

    @GetMapping("/get")
    public ResponseEntity<?> getDepartments(){

        return ResponseEntity.ok(this.departmentRepository.findAll());
    }


    @GetMapping("/get/{id}")
    public ResponseEntity<?> getDepartmentById(@PathVariable String id){
        return ResponseEntity.ok(this.departmentRepository.findById(id));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateDepartment(@PathVariable String id, @RequestBody Department department){
        Department existingDepartment = this.departmentRepository.findById(id).orElse(null);

        if(existingDepartment != null){
            existingDepartment.setDepartmentName(department.getDepartmentName());
            Department updatedDepartment = this.departmentRepository.save(existingDepartment);
            return ResponseEntity.ok(updatedDepartment);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteDepartment(@PathVariable String id){
        this.departmentRepository.deleteById(id);
        return ResponseEntity.ok("Department with ID " + id + " deleted successfully");
    }
}

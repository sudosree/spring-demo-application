package com.sree.department.controller;

import com.sree.department.service.DepartmentService;
import com.sree.dto.Department;
import com.sree.dto.DepartmentPreviewDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping
    public Collection<DepartmentPreviewDto> getAllDepartments() {
        return departmentService.getAllDepartments();
    }

    @GetMapping("/{departmentId}")
    public DepartmentPreviewDto getDepartmentById(@PathVariable("departmentId") int id) {
        return departmentService.getDepartmentById(id);
    }

    @PostMapping
    public void addDepartment(@RequestBody Department department) {
        departmentService.addDepartment(department);
    }

    @DeleteMapping("/{departmentId}")
    public void deleteDepartmentById(@PathVariable("departmentId") int id) {
        departmentService.deleteDepartmentById(id);
    }

    @PutMapping("/{departmentId}")
    public void updateDepartmentById(@PathVariable("departmentId") int id, @RequestBody Department department) {
        departmentService.updateDepartmentById(id, department);
    }

    /*@GetMapping("/{departmentId}/students")
    public DepartmentPreviewDto findStudentsByDepartment(@PathVariable int departmentId) {
        return departmentService.findStudentsByDepartment(departmentId);
    }*/
}

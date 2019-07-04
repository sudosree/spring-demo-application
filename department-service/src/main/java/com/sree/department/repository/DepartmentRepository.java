package com.sree.department.repository;

import com.sree.department.model.Department;

import java.util.Collection;

public interface DepartmentRepository {

    Collection<Department> getAllDepartments();

    Department getDepartmentById(int id);

    Department addDepartment(Department department);

    void deleteDepartmentById(int id);

    Department updateDepartmentById(int id, Department department);

    Department findStudentByDepartment(int id);
}
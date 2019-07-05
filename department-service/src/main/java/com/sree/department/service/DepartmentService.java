package com.sree.department.service;

import com.sree.department.model.Department;
import com.sree.preview.DepartmentPreview;

import java.util.Collection;

public interface DepartmentService {

    Collection<Department> getAllDepartments();

    Department getDepartmentById(int id);

    Department addDepartment(Department department);

    void deleteDepartmentById(int id);

    Department updateDepartmentById(int id, Department department);

    DepartmentPreview findStudentsByDepartment(int id);
}

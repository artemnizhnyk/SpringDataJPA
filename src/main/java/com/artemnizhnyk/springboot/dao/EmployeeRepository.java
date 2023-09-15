package com.artemnizhnyk.springboot.dao;

import com.artemnizhnyk.springboot.entity.Employee;
import java.util.List;

public interface EmployeeDAO {
    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployee(int id);

    void deleteEmployee(int id);
}

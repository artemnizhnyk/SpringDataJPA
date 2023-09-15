package com.artemnizhnyk.springboot.service;

import com.artemnizhnyk.springboot.dao.EmployeeRepository;
import com.artemnizhnyk.springboot.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public void saveEmployee(final Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployee(final int id) {
        Optional<Employee> optional = employeeRepository.findById(id);
        if(optional.isPresent()){
            return optional.get();
        }else throw new RuntimeException();
    }

    @Override
    public void deleteEmployee(final int id) {
        employeeRepository.deleteById(id);
    }
}

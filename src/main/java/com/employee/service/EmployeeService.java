package com.employee.service;

import com.employee.collection.Employee;

import java.util.List;

public interface EmployeeService {

    public Employee createEmployee(Employee employee);

    public List<Employee> getAllEmployees();
}

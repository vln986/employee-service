package com.employee.DAO;

import com.employee.collection.Employee;

import java.util.List;

public interface EmployeeDAO {

    public Employee saveEmployee(Employee employee);

    public List<Employee> getAllEmployeeList();
}

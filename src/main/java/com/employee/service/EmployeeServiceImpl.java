package com.employee.service;

import com.employee.DAO.EmployeeDAO;
import com.employee.collection.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements  EmployeeService{

    @Autowired
    EmployeeDAO employeeDAO;
    public Employee createEmployee(Employee employee){
        Employee emp = null;
        try{
            emp = employeeDAO.saveEmployee(employee);
        }catch (Exception e){
            e.getMessage();
        }
        return emp;
    }
}

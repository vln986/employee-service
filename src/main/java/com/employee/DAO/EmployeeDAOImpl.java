package com.employee.DAO;

import com.employee.collection.Employee;
import com.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeDAOImpl implements EmployeeDAO{

    @Autowired
    EmployeeRepository employeeRepository;
    public Employee saveEmployee(Employee employee) {
        Employee emp = null;
        try{
            emp = employeeRepository.save(employee);
        }catch (Exception e){
            e.getMessage();
        }
        return emp;
    }
    public List<Employee> getAllEmployeeList() {
        List<Employee> employeeList = null;
        try{
            employeeList = employeeRepository.findAll();
        }catch (Exception e){
            e.getMessage();
        }
        return employeeList;
    }
}

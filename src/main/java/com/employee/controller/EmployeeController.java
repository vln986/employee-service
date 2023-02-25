package com.employee.controller;

import com.employee.collection.Employee;
import com.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping( path = "/createEmployee",
            consumes = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE},
            produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee){
        try{
            Employee emp = employeeService.createEmployee(employee);
            return new ResponseEntity<>(emp, HttpStatus.CREATED);
        }catch (Exception e){
            e.getMessage();
        }
        return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @GetMapping("/getAllEmployees")
    public ResponseEntity<List<Employee>> getAllEmployees(){
        try{
            List<Employee> employeeList = employeeService.getAllEmployees();
            return new ResponseEntity<>(employeeList, HttpStatus.OK);
        }catch (Exception e){
            e.getMessage();
        }
        return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }


}

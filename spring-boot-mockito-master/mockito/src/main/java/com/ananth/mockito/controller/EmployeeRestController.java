package com.ananth.mockito.controller;

import com.ananth.mockito.entity.Employee;
import com.ananth.mockito.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employee")
    public Employee getAllEmployees() {
        return employeeService.getEmployeeByName("ananth");
    }

}

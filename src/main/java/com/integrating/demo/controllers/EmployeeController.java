package com.integrating.demo.controllers;

import com.integrating.demo.dto.EmployeeDTO;
import com.integrating.demo.entitites.EmployeeEntity;
import com.integrating.demo.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
public class EmployeeController {
    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(path ="/employees")
    public EmployeeDTO getEmployees()
    {
        return employeeService.getEmployee();

    }
    @PostMapping(path ="/postEmployees")
    public void postEmployee(@RequestBody EmployeeDTO employeeDTO) {
        System.out.println();
            employeeService.postEmployee(employeeDTO);
    }
}

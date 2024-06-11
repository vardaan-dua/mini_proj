package com.integrating.demo.services;

import com.integrating.demo.dto.EmployeeDTO;
import com.integrating.demo.entitites.EmployeeEntity;
import com.integrating.demo.repository.EmployeeRepository;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public EmployeeDTO getEmployee(){
        EmployeeEntity employeeEntity = employeeRepository.findAll().get(1);
        return new EmployeeDTO(employeeEntity.getId(),employeeEntity.getName(),employeeEntity.getDateOfJoining());
    }

    public void postEmployee(EmployeeDTO employeeDTO){
        System.out.println(employeeDTO.getId());
        System.out.println(employeeDTO.getName());
       employeeRepository.save(new EmployeeEntity(employeeDTO.getId(),employeeDTO.getName(),employeeDTO.getDateOfJoining()));
    }
}

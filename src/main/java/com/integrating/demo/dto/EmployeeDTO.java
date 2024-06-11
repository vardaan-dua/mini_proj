package com.integrating.demo.dto;

import lombok.*;

import java.time.LocalDate;
import java.util.Date;

@Setter
@Getter
@Data
public class EmployeeDTO {
    private int id;
    private String name ;
    private String dateOfJoining;

    public EmployeeDTO(int id, String name, String dateOfJoining) {
        this.id = id;
        this.name = name;
        this.dateOfJoining = dateOfJoining;
    }
    public EmployeeDTO(){

    }


    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateOfJoining='" + dateOfJoining + '\'' +
                '}';
    }
}

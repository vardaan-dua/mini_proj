package com.integrating.demo.entitites;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.validation.ObjectError;


@Data
@Document(collection = "Employees")
public class EmployeeEntity {
    private int id;
    private String name ;
    private String dateOfJoining;

    public EmployeeEntity(int id, String name, String dateOfJoining) {
        this.id = id;
        this.name = name;
        this.dateOfJoining = dateOfJoining;
    }
    public EmployeeEntity(){

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(String dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }


    @Override
    public String toString() {
        return "EmployeeEntity{" +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", dateOfJoining='" + dateOfJoining + '\'' +
                '}';
    }
}

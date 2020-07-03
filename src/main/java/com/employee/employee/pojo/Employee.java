package com.employee.employee.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class Employee {
    private int id;
    private String name;
    private int department_id;


    public Employee(int id, String name, int department_id) {
        this.id = id;
        this.name = name;
        this.department_id = department_id;
    }
}

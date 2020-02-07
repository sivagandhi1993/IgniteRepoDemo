package com.nisum.igniterepodemo.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;

@Data
@FieldDefaults(makeFinal = false, level = AccessLevel.PRIVATE)
public class Employee {
    @Id
    Integer id;
    String name;
    Boolean isEmployed = Boolean.FALSE;
    EmployeeDetails employeeDetails;
}

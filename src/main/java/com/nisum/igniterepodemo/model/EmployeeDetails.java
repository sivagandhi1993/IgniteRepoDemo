package com.nisum.igniterepodemo.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import javax.persistence.OneToOne;

@Data
@FieldDefaults(makeFinal = false , level = AccessLevel.PRIVATE)
public class EmployeeDetails {
    @OneToOne
    Integer id;
    String designation;
    String salary;
}

package com.telran.jpa2.entity;

import com.telran.jpa2.entity.types.EmployeePositionType;
import com.telran.jpa2.entity.types.EmployeePositionTypeConverter;
import lombok.*;

import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "employee")
public class Employee extends Base {

    private String employeeName;
    private Double employeeSalary;


    //ENUM -> INTEGER
    //INTEGER -> ENUM
    @Convert(converter = EmployeePositionTypeConverter.class)
    private EmployeePositionType employeeType;

}

package com.telran.jpa2.repository;

import com.telran.jpa2.entity.Employee;
import com.telran.jpa2.entity.types.EmployeePositionType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    List<Employee> findAllByEmployeeType(EmployeePositionType positionType);
}

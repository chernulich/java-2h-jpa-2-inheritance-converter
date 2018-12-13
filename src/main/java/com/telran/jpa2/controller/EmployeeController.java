package com.telran.jpa2.controller;

import com.telran.jpa2.entity.Employee;
import com.telran.jpa2.entity.types.EmployeePositionType;
import com.telran.jpa2.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;


    //      localhost:8080/add/asdasd?name=
    @PostMapping("/add")
    public Employee add(@RequestParam("name") String employeeFullName,
                        @RequestParam("salary") Integer salary,
                        @RequestParam("type") Integer type) {

        Employee employee = Employee.builder()
                .employeeName(employeeFullName)
                .employeeSalary(salary.doubleValue())
                .employeeType(EmployeePositionType.getById(type))
                .build();

        return employeeRepository.save(employee);
    }

    @GetMapping("/all")
    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }

    @GetMapping("/all/{type}")
    public List<Employee> getAllByType(@PathVariable("type") Integer type) {

        EmployeePositionType positionType = EmployeePositionType.getById(type);

        return employeeRepository.findAllByEmployeeType(positionType);
    }




    //psvm
    public static void main(String[] args) {
        System.out.println("Team leader: " + EmployeePositionType.TEAM_LEADER.getId());
        System.out.println(EmployeePositionType.getById(1));
    }
}

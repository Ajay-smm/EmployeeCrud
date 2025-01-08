package com.employee.controller;

import com.employee.entity.Employee;
import com.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

    @RestController
    @RequestMapping("/")
    public class EmployeeController {
        @Autowired
        EmployeeService employeeService;


        @GetMapping("{id}")
        public Employee getAllEmployee(@PathVariable String id) {
            return employeeService.getEmployeeDetails(id);
        }

        @PostMapping
        public String createEmployeeDetails(@RequestBody Employee employee) {
            return employeeService.createEmployee(employee);
        }


        @PutMapping
        public String updateEmployeeDetails(@RequestBody Employee employee) {
            return employeeService.updateEmployee(employee);
        }

        @DeleteMapping("{id}")
        public String deleteEmployeeDetails(@PathVariable String id) {
            return employeeService.deleteEmployee(id);
        }

    }

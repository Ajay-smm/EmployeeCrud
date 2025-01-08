package com.employee.service;

import com.employee.entity.Employee;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private Employee employee;

   @Override
     public Employee getEmployeeDetails(String id) {

        if (id.equals("10")) {
            return new Employee("10", "john", "100");
        }
        else if (id.equals("20")) {
            return new Employee("20", "rob", "200");
        }
        else if (id.equals("30")) {
            return new Employee("30", "arya", "300");
        }

        else {
            return null;
        }
     }


    @Override
    public String createEmployee(Employee employee) {
        this.employee=employee;
        return "created employee objects";
    }

    @Override
    public String updateEmployee(Employee employee) {
        this.employee = employee;
        return "Product updated successfully";
    }

    @Override
    public String deleteEmployee(String id) {
        this.employee = null;
        return "deleted employee successfully";
    }

}

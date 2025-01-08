package com.employee.service;

import com.employee.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private Employee employee;


    private final List<Employee> employees = new ArrayList<>();

    @Override
    public Employee getEmployeeDetails(String id) {
        return employees.stream()
                .filter(employee -> employee.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public String createEmployee(Employee employee) {
        employees.add(employee);
        return "Created employee successfully";
    }

    @Override
    public String updateEmployee(Employee employee) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId().equals(employee.getId())) {
                employees.set(i, employee);
                return "Employee updated successfully";
            }
        }
        return "Employee not found";
    }

    @Override
    public String deleteEmployee(String id) {
        employees.removeIf(employee -> employee.getId().equals(id));
        return "Deleted employee successfully";
    }


    @Override
    public Employee getHighestPaidEmployee() {
        return employees.stream()
                .max((e1,e2) -> Integer.compare(Integer.parseInt(e1.getSalary()),Integer.parseInt(e2.getSalary())))
                .orElse(null);

    }



}

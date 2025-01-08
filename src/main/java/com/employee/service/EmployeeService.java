package com.employee.service;

import com.employee.entity.Employee;

public interface EmployeeService {
    public Employee getEmployeeDetails(String id);

    String createEmployee(Employee employee);

    String updateEmployee(Employee employee);

    String deleteEmployee(String id);

}

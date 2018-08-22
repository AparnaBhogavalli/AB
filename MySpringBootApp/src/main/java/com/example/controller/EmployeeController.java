package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Employee;

@RestController
public class EmployeeController
{
    @RequestMapping("/Employees")
    public List<Employee> getEmployees()
    {
        List<Employee> employeesList = new ArrayList<Employee>();
        employeesList.add(new Employee(1,"Aparna","Bhogavalli","aparna.bhogavalli@accenture.com"));
        employeesList.add(new Employee(2,"Anusha","B","anusha.b@accenture.com"));
        employeesList.add(new Employee(3,"Ankita","B","ankita.b@accenture.com"));
        employeesList.add(new Employee(4,"Alisha","B","alisha.b@accenture.com"));
        return employeesList;
    }
}
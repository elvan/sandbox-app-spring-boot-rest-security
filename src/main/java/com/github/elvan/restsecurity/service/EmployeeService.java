package com.github.elvan.restsecurity.service;

import java.util.List;

import com.github.elvan.restsecurity.entity.Employee;

public interface EmployeeService {

  List<Employee> findAll();

  Employee findById(int theId);

  Employee save(Employee theEmployee);

  void deleteById(int theId);

}

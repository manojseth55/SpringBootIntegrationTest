package com.learnwithpoc.SpringBootIntegrationTest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learnwithpoc.SpringBootIntegrationTest.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}

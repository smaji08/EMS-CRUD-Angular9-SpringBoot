package com.example.SpringBootAngular2EMS.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringBootAngular2EMS.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}

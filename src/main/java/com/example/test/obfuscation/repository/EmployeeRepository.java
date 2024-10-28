package com.example.test.obfuscation.repository;

import com.example.test.obfuscation.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

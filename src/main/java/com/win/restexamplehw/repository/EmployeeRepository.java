package com.win.restexamplehw.repository;

import com.win.restexamplehw.domain.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    
}
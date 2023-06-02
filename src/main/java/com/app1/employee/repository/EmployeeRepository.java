package com.app1.employee.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app1.employee.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
	
}

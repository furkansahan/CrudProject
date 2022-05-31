package com.furkansahan.springdataconnectmvc.repository;

import com.furkansahan.springdataconnectmvc.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

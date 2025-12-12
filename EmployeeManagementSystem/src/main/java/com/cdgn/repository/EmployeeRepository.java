package com.cdgn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cdgn.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
	public boolean existsByEmailAndPassword(String email,String password);

	public Employee findByEmailAndPassword(String email, String password);

}
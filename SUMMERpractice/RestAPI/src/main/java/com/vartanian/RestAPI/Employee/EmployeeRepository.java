package com.vartanian.RestAPI.Employee;

import com.vartanian.RestAPI.Employee.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

interface EmployeeRepository extends JpaRepository<Employee,Long>{

}

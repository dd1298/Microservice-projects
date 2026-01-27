package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hr")
public class HrResouce {

	public HrResouce() {
		// TODO Auto-generated constructor stub
	}
	
	List<Employee> employees = Arrays.asList(
			new Employee("1","Ram","Kumar","Medtech"),
			new Employee("2","Raman","Kumar","Surgery"),
			new Employee("3","Ramanujan","Kumar","Dentist"));
	
	@RequestMapping("/employees")
	public EmployeeList getEmployees() {
		EmployeeList empList = new EmployeeList();
		empList.setEmployees(employees);
		return empList;
	}
	@RequestMapping("/employees/{id}")
	public Employee getEmployeeById(@PathVariable("id") String id) {
		Employee emp = employees.stream()
				.filter(e->id.equals(e.getId()))
				.findAny()
				.orElse(null);
		return emp;
				
	}
}

package com.java.krish.test;

import java.util.List;
import java.util.stream.Collectors;

import com.java.krish.dao.Employee;
import com.java.krish.service.EmployeeService;

public class DistinctDepartments {

	public static void main(String[] args) {

		List<Employee> employees = EmployeeService.getEmployeesWithDepartment();
		String result = employees.stream().map(Employee::getDepartment).distinct().collect(Collectors.joining(", "));
		System.out.println(result);
	}

}

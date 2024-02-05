package com.java.krish.test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.java.krish.dao.Employee;
import com.java.krish.service.EmployeeService;

public class CountOfEachDepartment {

	public static void main(String[] args) {

		List<Employee> employees = EmployeeService.getEmployeesWithDepartment();
		Map<String, Long> result = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		System.out.println(result);

	}

}

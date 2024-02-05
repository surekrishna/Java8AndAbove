package com.java.krish.test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.java.krish.dao.Employee;
import com.java.krish.service.EmployeeService;

public class AvgAgeOfMaleAndFemale {

	public static void main(String[] args) {
		List<Employee> employees = EmployeeService.getEmployeesWithDepartmentAndGender();
		Map<String, Double> result = employees.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
		System.out.println(result);
	}

}

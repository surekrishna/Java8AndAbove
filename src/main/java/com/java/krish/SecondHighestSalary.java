package com.java.krish.tesco;

import java.util.Comparator;
import java.util.List;

import com.java.krish.dao.Employee;
import com.java.krish.service.EmployeeService;

public class SecondHighestSalary {

	public static void main(String[] args) {
		List<Employee> employees1 = EmployeeService.getEmployees();
		System.out.println(employees1);
		System.out.println(getSecondHighestSalary(employees1));
		
		System.out.println(getSecondHighestSalary1(employees1));
	}

	public static Employee getSecondHighestSalary(List<Employee> employees) {
		return employees.stream()
				.distinct()
				.sorted(Comparator.comparing(Employee::getSalary, Comparator.reverseOrder()))
				.skip(1).findFirst()
				.orElseThrow(() -> new RuntimeException("No second highest salary found"));
	}
	
	public static int getSecondHighestSalary1(List<Employee> employees) {
		return employees.stream()
				.map(Employee::getSalary)
				.distinct()
				.sorted(Comparator.reverseOrder())
//				.sorted((s1, s2) -> s2.compareTo(s1))
				.skip(1).findFirst()
				.orElseThrow(() -> new RuntimeException("No second highest salary found"));
	}

}

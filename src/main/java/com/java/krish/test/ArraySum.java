package com.java.krish.test;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.java.krish.dao.Employee;
import com.java.krish.service.EmployeeService;

public class ArraySum {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(2, 5, 1, 19, 56);
		sumOfList(numbers);

		List<Employee> employees = EmployeeService.getEmployees();
		System.out.println("Before sort : " + employees);
		employees = sortBySalaryDesc(employees);
		System.out.println("After sort : " + employees);

		List<Employee> top3 = getTop3(employees);
		System.out.println("Top 3 records : " + top3);

		List<Employee> lessThan3rdHighest = getBelow3rdHighest(employees);
		System.out.println(lessThan3rdHighest);
		
		List<Employee> employees1 = EmployeeService.getEmployees();
		System.out.println("Before sort : " + employees1);
		employees1 = sortBySalaryDesc1(employees1);
		System.out.println("After sort : " + employees1);

	}

	// Find sum of all elements in an array using java 8
	public static void sumOfList(List<Integer> numbers) {
		int sum = numbers.stream().mapToInt(Integer::intValue).sum();
		System.out.println("sum of arry is : " + sum);
	}

	// Sort employees based on salary desc order
	public static List<Employee> sortBySalaryDesc(List<Employee> employees) {
		return employees.stream().sorted(Comparator.comparing(Employee::getSalary, Comparator.reverseOrder()))
				.collect(Collectors.toList());
	}

	// Sort employees based on salary desc order
	public static List<Employee> sortBySalaryDesc1(List<Employee> employees) {
		return employees.stream().sorted((e1, e2) -> e2.getSalary() - e1.getSalary()).collect(Collectors.toList());
	}

	// Get top 3 salary employees.
	public static List<Employee> getTop3(List<Employee> employees) {
		return employees.stream().limit(3).collect(Collectors.toList());
	}

	// Fetch all employees having salary less than 3rd highest salary
	public static List<Employee> getBelow3rdHighest(List<Employee> employess) {
		return employess.stream().skip(3).collect(Collectors.toList());
	}

}

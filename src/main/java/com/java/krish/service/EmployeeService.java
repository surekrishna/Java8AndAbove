package com.java.krish.service;

import java.util.ArrayList;
import java.util.List;

import com.java.krish.dao.Employee;

public class EmployeeService {
	
	public static List<Employee> getEmployeesWithDepartmentAndGender() {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(1, "Ram", 39, 23000, "HR", "M"));
		employees.add(new Employee(2, "Sita", 12, 49000, "IT", "F"));
		employees.add(new Employee(3, "Shiva", 78, 97000, "ADMIN", "M"));
		employees.add(new Employee(4, "Parvathi", 50, 53000, "IT", "F"));
		employees.add(new Employee(5, "Hanuman", 28, 12000, "HR", "M"));
		employees.add(new Employee(6, "Laxman", 61, 35000, "ADMIN", "M"));
		employees.add(new Employee(7, "Krishna", 91, 74000, "MANAGER", "M"));
		employees.add(new Employee(8, "Radha", 84, 53000, "DEVOPS", "F"));
		employees.add(new Employee(9, "Bheema", 42, 81000, "NETWORK", "M"));
		employees.add(new Employee(10, "Arjuna", 36, 68000, "MANAGER", "M"));
		employees.add(new Employee(11, "Karna", 10, 20000, "ONBOARDING", "M"));

		return employees;
	}

	public static List<Employee> getEmployeesWithDepartment() {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(1, "Ram", 39, 23000, "HR"));
		employees.add(new Employee(2, "Sita", 12, 49000, "IT"));
		employees.add(new Employee(3, "Shiva", 78, 97000, "ADMIN"));
		employees.add(new Employee(4, "Parvathi", 50, 53000, "IT"));
		employees.add(new Employee(5, "Hanuman", 28, 12000, "HR"));
		employees.add(new Employee(6, "Laxman", 61, 35000, "ADMIN"));
		employees.add(new Employee(7, "Krishna", 91, 74000, "MANAGER"));
		employees.add(new Employee(8, "Bheema", 42, 81000, "NETWORK"));
		employees.add(new Employee(9, "Arjuna", 36, 68000, "MANAGER"));
		employees.add(new Employee(10, "Karna", 10, 20000, "ONBOARDING"));

		return employees;
	}

	public static List<Employee> getEmployees() {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(1, "Ram", 39, 23000));
		employees.add(new Employee(2, "Sita", 12, 49000));
		employees.add(new Employee(3, "Shiva", 78, 97000));
		employees.add(new Employee(4, "Parvathi", 50, 53000));
		employees.add(new Employee(5, "Hanuman", 28, 12000));
		employees.add(new Employee(6, "Laxman", 61, 35000));
		employees.add(new Employee(7, "Krishna", 91, 74000));
		employees.add(new Employee(8, "Bheema", 42, 81000));
		employees.add(new Employee(9, "Arjuna", 36, 68000));
		employees.add(new Employee(10, "Karna", 10, 20000));

		return employees;
	}
}

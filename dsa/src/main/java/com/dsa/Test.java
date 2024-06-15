package com.dsa;

import java.util.DoubleSummaryStatistics;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 
 * findSumTarget(9, new int[]{13, 2, 15, 7}))
 *
 */
public class Test {
	public static void main(String[] args) {
		// Created 4 Employee Objects
		Employee e1 = new Employee("e1", "Amar", 1000.0, 12, "HR");
		Employee e2 = new Employee("e2", "Akbar", 1050.5, 13, "Admin");
		Employee e3 = new Employee("e3", "Anthony", 1100.0, 34, "HR");
		Employee e4 = new Employee("e4", "Geeta", 1200.0, 35, "Admin");
		// Populate employee Object in map.
		Map<String, Employee> empMap = new HashMap<String, Employee>();
		empMap.put("e1", e1);
		empMap.put("e2", e2);
		empMap.put("e3", e3);
		empMap.put("e4", e4);
		processEmployees(empMap, "HR");
	}

	private static void processEmployees(Map<String, Employee> empMap, String dept) {
		DoubleSummaryStatistics sumSalary = empMap.entrySet().stream().filter(e -> e.getValue().getDept().equals(dept))
				.map(e -> e.getValue()).collect(Collectors.summarizingDouble(Employee::getSalary));
		System.out.println(sumSalary.getSum());

	}

//	public static int findSumTarget(int target, int[] input) {
//		HashSet<Integer> hashSet = new HashSet<>();
//		// logn
//		for (int i = 0; i < input.length; i++) { // O(N)
//			if (hashSet.contains(target - input[i])) {
//				System.out.println("target sum found :: " + (target - input[i]) + " " + input[i]);
//				break;
//			} else {
//				hashSet.add(input[i]);
//			}
//		}
//		return 0;
//	}

	static class Employee {
		public Employee(String empId, String empName, Double salary, int age, String dept) {
			this.empId = empId;
			this.empName = empName;
			this.salary = salary;
			this.age = age;
			this.dept = dept;
		}

		public String empId;
		public String empName;
		public Double salary;
		public int age;
		public String dept;

		@Override
		public String toString() {
			return "Employee{" + "empId='" + empId + '\'' + ", empName='" + empName + '\'' + ", salary=" + salary
					+ ", age=" + age + ", dept='" + dept + '\'' + '}';
		}

		public String getEmpId() {
			return empId;
		}

		public String getEmpName() {
			return empName;
		}

		public Double getSalary() {
			return salary;
		}

		public int getAge() {
			return age;
		}

		public String getDept() {
			return dept;
		}

		public void setEmpId(String empId) {
			this.empId = empId;
		}

		public void setEmpName(String empName) {
			this.empName = empName;
		}

		public void setSalary(Double salary) {
			this.salary = salary;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public void setDept(String dept) {
			this.dept = dept;
		}
	}
}

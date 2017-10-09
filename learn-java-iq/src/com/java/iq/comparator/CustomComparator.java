package com.java.iq.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomComparator {

	public static void main(String[] args) {

		// Custom comparator
		final Comparator<Employee> comp = new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				int comparator = o1.getName().compareTo(o2.getName());

				if (comparator == 0) {
					if (o1.getAge() > o2.getAge()) {
						comparator = 1;
					} else if (o1.getAge() < o2.getAge()) {
						comparator = -1;
					} else {
						comparator = 0;
					}
				}

				return comparator;
			}
		};

		Employee employee1 = new Employee("abc", 33);
		Employee employee2 = new Employee("abc", 32);
		Employee employee3 = new Employee("abc", 31);

		final List<Employee> employees = new ArrayList<Employee>();
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		System.out.println(employees);

		// Collections.sort(employees);
		// System.out.println(employees);

		Collections.sort(employees, comp);
		System.out.println(employees);

	}

}

// To use Collections.sort(), Employee class must implement Comparable interface and override compareTo() method
// Employee class can implement Comparator and override compare() method
class Employee implements Comparable<Employee>, Comparator<Employee> {

	private String name;
	private int age;

	public Employee() {
	}

	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compare(Employee o1, Employee o2) {
		int comparator = o1.getName().compareTo(o2.getName());

		if (comparator == 0) {
			if (o1.getAge() < o2.getAge()) {
				comparator = 1;
			} else if (o1.getAge() > o2.getAge()) {
				comparator = -1;
			} else {
				comparator = 0;
			}
		}

		return comparator;
	}

	@Override
	public int compareTo(Employee obj) {
		int comparator = name.compareTo(obj.getName());

		if (comparator == 0) {
			if (age < obj.getAge()) {
				comparator = 1;
			} else if (age > obj.getAge()) {
				comparator = -1;
			} else {
				comparator = 0;
			}
		}

		return comparator;
	}

}
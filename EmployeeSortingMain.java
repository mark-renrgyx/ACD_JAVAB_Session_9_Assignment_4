package week1.day9.assignment4;

import java.util.TreeSet;

public class EmployeeSortingMain {

	public static void main(String[] args) {
		TreeSet<Employee> employees = new TreeSet<Employee>();	// no comparator, natural sorting using Employee Comparable implementation
		
		employees.add(new Employee ("Tim", "Welder", 70000));
		employees.add(new Employee ("Bill", "Welder", 70000));
		employees.add(new Employee ("Frank", "President", 110000));
		employees.add(new Employee ("James", "Manager", 90000));
		employees.add(new Employee ("James", "Welder", 70000));
		
		System.out.println(employees);
		
		employees = new TreeSet<Employee>(new NameSorter());	// comparator to sort by name, then designation
		employees.add(new Employee ("Tim", "Welder", 70000));
		employees.add(new Employee ("Bill", "Welder", 70000));
		employees.add(new Employee ("Frank", "President", 110000));
		employees.add(new Employee ("James", "Manager", 90000));
		employees.add(new Employee ("James", "Welder", 70000));
		
		System.out.println(employees);
	}
}

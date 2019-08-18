package week1.day9.assignment4;

public class Employee implements Comparable<Object> {
	private String name;
	private String designation;
	private int salary;
	
	public Employee(String name, String designation, int salary) {
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String toString () {
		return "\n" + name + ", " + designation + ": $" + salary; 
	}

	@Override
	public int compareTo(Object o) {
		if (o == null || !(o instanceof Employee))
			return 1;
		Employee comp = (Employee) o;
		if (salary != comp.getSalary())
			return salary - comp.getSalary();
		//else
		return name.compareToIgnoreCase(comp.getName());
	}
}

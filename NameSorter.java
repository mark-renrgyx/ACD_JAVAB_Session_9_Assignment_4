package week1.day9.assignment4;

import java.util.Comparator;

public class NameSorter implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		int nameCompare = o1.getName().compareToIgnoreCase(o2.getName());
		if (nameCompare != 0)
			return nameCompare;
		//else
		return o1.getDesignation().compareToIgnoreCase(o2.getDesignation());
	}
}

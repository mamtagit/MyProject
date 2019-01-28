package practice;

import java.util.HashSet;
import java.util.Set;

public class Employee {
	public static void main(String[] args) {
		Set<Integer> emp = new HashSet<Integer>();
		emp.add(10);
		emp.add(20);
		emp.add(30);
		emp.add(10);
		System.out.println(emp);

	}

}

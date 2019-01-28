package org.cts.test.login;

public class Employee {
	public void empId(String name) {
		// TODO Auto-generated method stub
		System.out.println("String meth" +name);

	}
	public void empId(int name) {
		// TODO Auto-generated method stub
		System.out.println("string meth" +name);

	}
	public void empId(float sal,char email) {
		// TODO Auto-generated method stub
		System.out.println("float char meth" +sal +email);

	}
	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.empId("siddu");
		emp.empId("siddu@gmail.com");
		emp.empId(43556);
		
	
	}

}

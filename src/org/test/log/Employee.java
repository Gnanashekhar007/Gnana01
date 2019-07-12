package org.test.log;

public class Employee {

	 public void empId(String name) {
		 System.out.println("String method"+name);
	 }
	 public void empId(long phno) {
		 System.out.println("long method"+phno);
	 }
	 public static void main(String[] args) {
		Employee e=new Employee();
		e.empId(56456456l);
		e.empId("Master of Githup");
	}
}

package org.cts;

//import packagename.classname;
import org.login.Client;

public class Employee {
//Different package Access-Employee and Client classes present in 2 diff packages but 
//we are trying to access Employee class properities in client and vice versa

	// u need import statement
	public void empName() {
		System.out.println("Employee name: jessie");
	}

	public void empId() {
		System.out.println("Employee id:1234");
	}

	public static void main(String[] args) {
		Employee e = new Employee();
		e.empName();
		e.empId();

		Client c=new Client();
		c.clientId();
		c.clientName();

	}

}

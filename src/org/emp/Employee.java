package org.emp;
//AccessSpecifier class ClassName
public class Employee {

	private void empId() {
		System.out.println("Employee id is 123");
		
	}
	private void empName() {   
		System.out.println("Employee name is Taj");
		// TODO Auto-generated method stub

	}
	private void empDob() {
		System.out.println("Employee Dob is 01.01.2001");
		// TODO Auto-generated method stub

	}
	private void empPhone() {
		System.out.println("Employee phone is 9876543210");
		// TODO Auto-generated method stub

	}
	private void empEmail() {
		System.out.println("Employee email is taj@gamil.com");
		// TODO Auto-generated method stub

	}
	private void empAddress() {
		System.out.println("Employee address is erode");
		// TODO Auto-generated method stub

	}
	public static void main(String[] args) {
		Employee a =new Employee();
		a.empId();
		a.empName();
		a.empDob();
		a.empPhone();
		a.empEmail();
		a.empAddress();
		
	}
}

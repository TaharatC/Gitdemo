package hw;

public class Employee {
	//static variables
	static int employeeCount;
	static String companyName;
	//instance variables
	short id;
	String name;
	double salary;
	
	public void printEmployeeDetails () {
	//local variables
	String localDepartment = "shankar academy";
	double localTaxRate = 22;
		System.out.println(localDepartment);
		System.out.println(localTaxRate);
		
		
		
		
	id = 12345;
	name = "T Academy";
	salary = 39990.65;
	System.out.println("value:"+id);
	System.out.println("value:"+name);
	System.out.println("value:"+salary);
	}
	
	public static void main(String[] args) {
		
		Employee.employeeCount = 18;
		Employee.companyName = "Tacademy";
		System.out.println("value: "+Employee.employeeCount);
		System.out.println("value:"+Employee.companyName);
		Employee Homework = new Employee();
		Homework.printEmployeeDetails();
	}

}

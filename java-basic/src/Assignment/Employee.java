package Assignment;

public class Employee {
	double salary=0;
	String empId="";
	String empName="";
	Employee(double salary,String empId,String empName){
		this.salary=salary;
		this.empId=empId;
		this.empName=empName;

	}
	Employee(Employee e){
		this.empId=e.empId;
		this.empName=e.empName;
		this.salary=e.salary;
		
	}
	void Calculate(Employee e) {
		double pf=(0.12*(salary));
		double allowances=(0.1*salary);
		double basicSalary=salary-pf-allowances;
		System.out.println("The salary of "+empName+" is: "+salary);
		System.out.println("pf of "+empName+" is: "+pf);
		System.out.println("allowances of "+empName+" is: "+allowances);
		System.out.println("Received salary of "+empName+" is: "+basicSalary);
		
	}

}

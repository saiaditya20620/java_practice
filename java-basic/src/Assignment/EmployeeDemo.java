package Assignment;

import java.util.Scanner;

public class EmployeeDemo {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		double sal=sc.nextDouble();
		String empN=sc.next();
		String empI=sc.next();		
		Employee emp1=new Employee(sal,empN,empI);
		Employee emp2=new Employee(emp1);
		emp2.Calculate(emp2);
		
	}

}

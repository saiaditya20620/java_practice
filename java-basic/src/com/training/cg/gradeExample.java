package com.training.cg;

import java.util.Scanner;

public class gradeExample
{
   void validate(int grade) throws gradeException{
	if(grade<65 || grade>70){
		throw new gradeException("Product Invalid");
	}
	else {
		System.out.println("The grade is valid");
	}
   }
   public static void main(String args[])
   {
   	gradeExample obj = new gradeExample();
   	Scanner sc = new Scanner(System.in);  
   	System.out.println("enter the grade value:");
   	char chr = sc.next().charAt(0);  
   	int gradeValue = (int)chr;
       try
       {
           obj.validate(gradeValue);
       }
       catch (gradeException ex)
       {
           System.out.println("Caught the exception");
           System.out.println(ex.getMessage());
       }
   }
}

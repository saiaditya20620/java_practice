package com.training.cg.dp;

import java.util.Scanner;

public class SumOfNaturalNumbers {
	public static void main(String args[]) {
		System.out.println("Enter a number:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int sum=0;
		for(int i=1;i<=a+1;i++) {
			sum+=i;
		}
		System.out.println("Sum of 'n' natural numbers-->"+sum);
	}
	

}

package com.training.cg;

public class LambdaDemo {
	public static void main(String args[]) {
		demoInterface w = (a,b,c)->{
			float d=(a+b+c)/3;
			System.out.println("the average of three numbers is:"+(d));
			
		};
		w.Average(10,20,30);
	}

}

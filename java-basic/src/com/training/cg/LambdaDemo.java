package com.training.cg;

public class LambdaDemo {
	public static void main(String args[]) {
		arrayLambda w = (a)->{
			float sum=0;
			for(int i=0;i<=a.length-1;i++){
				sum+=a[i];		
			}
			System.out.println("the average :"+sum/(a.length));
		};
		int[] num= {2,3,4,5,6};
		w.Average(num);
	}

}

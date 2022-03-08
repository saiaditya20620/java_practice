package com.training.cg;
import java.util.Random;
import java.util.Scanner;

public class firstcode {
	public static void main(String args[])
	{
		
		 Random rand = new Random();
		 int rand_int1 = rand.nextInt(10);
		 int count=0;
		for(int i=0;i<4;i++) {
			count++;
			 Scanner myObj = new Scanner(System.in);
			 System.out.println("enter a random number below 10");
			 int num = myObj.nextInt();
			 if(rand_int1== num){
				 
				 System.out.println("Congrats!! you guessed it right at a count of"+count);
				 
			 }
			 
			 else {
				 System.out.println("Not really try again");
			 }
		}			
}
}

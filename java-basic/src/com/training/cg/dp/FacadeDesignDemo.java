package com.training.cg.dp;
import java.util.Scanner;

public class FacadeDesignDemo {
	 private static int  choice;  
	    public static void main(String args[]){  
	        do{       
	            System.out.print("Mobile Shop: \n");  
	            System.out.print("1. Iphone.\n");  
	            System.out.print("2. Samsung.\n");  
	            System.out.print("3. Google Pixel.            \n");  
	            System.out.print("4. Exit.                     \n");  
	            System.out.print("Enter your choice: ");  
	              
	            
	            Scanner sc = new Scanner(System.in);
	            int choice=sc.nextInt();
	            ShopKeeper sk=new ShopKeeper();
	              
	            switch (choice) {  
	            case 1:  
	                {   
	                  sk.iphoneSale();  
	                    }  
	                break;  
	       case 2:  
	                {  
	                  sk.samsungSale();        
	                    }  
	                break;    
	       case 3:  
	                           {  
	                           sk.googlePixelSale();       
	                           }  
	                   break;     
	            default:  
	            {    
	                System.out.println("Nothing You purchased");  
	            }         
	                return;  
	            }  
	              
	      }while(choice!=4);  
	   }  

}

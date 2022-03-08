package com.training.cg;
import java.io.*;
import java.util.*;
public class productTest {
	public static void main(String[] args) {
		Product prod1=new Product();
		Product prod2=new Product();
		Product prod3=new Product();
		Product prod4=new Product();
		Product prod5=new Product();
		prod1.setPrice(100);
		prod2.setPrice(200);
		prod3.setPrice(300);
		prod4.setPrice(400);
		prod5.setPrice(500);
		prod1.setProdId("1_TRAP");
		prod2.setProdId("2_TRAP");
		prod3.setProdId("3_TRAP");
		prod4.setProdId("4_TRAP");
		prod5.setProdId("5_TRAP");
		prod1.setProdDisc("i3,8gb,240Gb");
		prod2.setProdDisc("i5,16gb,512Gb");
		prod3.setProdDisc("i7,4gb,1Tb");
		prod4.setProdDisc("i9,32gb,2Tb");
		prod5.setProdDisc("i3,20gb,3Tb");
		prod1.setProdName("Dell");
		prod2.setProdName("Lenovo");
		prod3.setProdName("Acer");
		prod4.setProdName("Apple");
		prod5.setProdName("Hp");
		int[] x= {prod1.getPrice(),prod2.getPrice(),prod4.getPrice(),prod5.getPrice()};
		Hashtable<Integer,String> h = new Hashtable();
        h.put(prod1.getPrice(),prod1.getProdName());
        h.put(prod1.getPrice(),prod1.getProdName());
        h.put(prod1.getPrice(),prod1.getProdName());
        h.put(prod1.getPrice(),prod1.getProdName());
        h.put(prod1.getPrice(),prod1.getProdName());
        int temp;  
        for (int i = 0; i < x.length-1; i++)   
                {  
                    for (int j = i + 1; j < x.length-1; j++)   
                    {  
                        if (x[i] > x[j])   
                        {  
                            temp = x[i];  
                            x[i] = x[j];  
                            x[j] = temp;  
                        }  
                    }  
                }
               
        }  
        
	}



package com.training.cg;
import java.util.*;

public class CollectionDemo {
	public static void main(String args[]){  
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		list.add("ArrayList"); 
		list.add("Practice");   
		Iterator<String> it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		  
		}  

}

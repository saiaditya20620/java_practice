package com.training.cg;

import java.util.ArrayList;
import java.util.Collections;

public class TestSort3{  

public static void main(String args[]){  
	Student stud1=new Student(2, "A", "Delhi", "1H01");
	Student stud2=new Student(6, "B", "Chennai", "1H02");
	Student stud3=new Student(4, "C", "Hyderabad", "1H03");
	Student stud4=new Student(8, "D", "Ranchi", "1H04");
	Student stud5=new Student(3, "E", "Lucknow", "1H05");
	
ArrayList<Student> al=new ArrayList<Student>();  
al.add(stud1);
al.add(stud2);
al.add(stud3);
al.add(stud4);
al.add(stud5);

Collections.sort(al);
for(Student st: al){  
System.out.println(st.grade+" "+st.studName+" "+st.studId+" "+st.studAddress);  
} 
}
}
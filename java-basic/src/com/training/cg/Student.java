package com.training.cg;

class Student implements Comparable<Student>{  
float grade;  
String studAddress;  
String studId;
String studName;
Student(float grade,String studName,String studAddress,String studId){  
this.grade=grade;  
this.studId=studId;  
this.studName=studName;  
this.studAddress=studAddress;
}  
public int compareTo(Student st){  
if(grade==st.grade)  
return 0;  
else if(grade>st.grade)  
return -1;  
else  
return 1;  
}  
}  


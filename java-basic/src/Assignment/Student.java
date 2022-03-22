package Assignment;
public class Student {
    
    int id;
    String name;
    int age;
    public Student(int i,String n,int a) {
    	id=i;
    	name=n;
    	age=a;
    	
    }
    public boolean isEqual(Student s) {
    	if(s.id==id && s.name==name && s.age==age) {
    		return true;
    	}
    	else {
		return false;
    	}
    	
    }

}
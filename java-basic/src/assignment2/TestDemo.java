package assignment2;

public class TestDemo {
public static void main(String[] args) {
		
		Square Square1 = new Square(5,"Square");
		System.out.println("The shape is "+Square1.getName()+" and area is "+Square1.getArea()+" sq.units");
		
		Cube Cube1 = new Cube(6,"Cube");
		System.out.println("The shape is "+Cube1.getName()+" and area is "+Cube1.getVolume()+" cu.units");
		
		Circle Circle1 = new Circle(5,"Circle");
		System.out.println("The shape is "+Circle1.getName()+" and area is "+Circle1.getArea()+" sq.units");
		
		Cylinder Cylinder1 = new Cylinder(5,6,"Cylinder");
		System.out.println("The shape is  "+Cylinder1.getName()+" and volume is "+Cylinder1.getVolume()+" cu.units");
		
		Sphere Sphere1 = new Sphere(7,"Sphere");
		System.out.println("The shape is "+Sphere1.getName()+" and volume is "+Sphere1.getVolume()+" cu.units");
		
		Glome Glome1 = new Glome(8,"Glome");
		System.out.println("The shape is "+Glome1.getName()+" and volume is "+Glome1.getVolume()+" cu.units");
	
	}
	
	

}

package assignment2;

public class Circle extends Shape implements Area{
	double r;
	String n;
	
	Circle(double r, String n){
		this.r = r;
		this.n = n;
	}
	
	@Override
	public double getArea() {
		double a = Math.PI;
		a *= Math.pow(this.r,2);
		return a;
	}
}

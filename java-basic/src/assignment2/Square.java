package assignment2;

public class Square extends Shape implements Area{
double s;
	
	Square(double s,String n){
		this.s = s;
		this.n = n;
	}
	
	@Override
	public double getArea() {
		double area;
		area = Math.pow(this.s,2);
		return area;
	}
}

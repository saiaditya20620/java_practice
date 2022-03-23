package assignment2;

public class Cylinder extends Circle implements Volume{
private double h;
	
	Cylinder(double h,double r,String n){
		super(r,n);
		this.h = h;
	}

	@Override
	public double getVolume() {
		double volume;
		volume = super.getArea()*this.h;
		return volume;
	}

}

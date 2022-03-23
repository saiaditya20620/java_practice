package assignment2;

public class Glome extends Sphere implements Volume{
	Glome(double r, String n) {
		super(r, n);
	}
	
	@Override
	public double getVolume() {
		double v = 2*Math.pow(Math.PI, 2);
		v *= Math.pow(this.r,3);
		return v;
	}
}

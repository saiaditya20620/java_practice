package assignment2;

public class Sphere extends Circle implements Volume{
	Sphere(double r, String n) {
		super(r, n);
	}

	@Override
	public double getVolume() {
		double v = (4/3);
		v *= super.getArea()*this.r;
		return v;
	}

}

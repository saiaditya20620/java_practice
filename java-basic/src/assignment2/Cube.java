package assignment2;

public class Cube extends Square implements Volume{
	Cube(double s, String n) {
		super(s, n);
	}

	@Override
	public double getVolume() {
		double volume;
		volume = Math.pow(this.s,3);
		return volume;
	}
}

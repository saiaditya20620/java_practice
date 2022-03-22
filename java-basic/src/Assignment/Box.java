package Assignment;

public class Box {
	
	private double l=0;
	private double b=0;
	private double h=0;
	public Box(Box obj) {
		this.l=obj.l;
		this.b=obj.b;
		this.h=obj.h;
		
	}
	

	Box(int l,int b,int h){
		this.l=l;
		this.b=b;
		this.h=h;
	}



	double volume() {
		double v=l*b*h;
		return v;
		
	}
	

}

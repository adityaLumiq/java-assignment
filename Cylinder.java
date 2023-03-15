public class Cylinder extends Circle{
	double height;
	Cylinder(double r, String c, double h){
		super(r, c);
		height = h;
	}
	public double getVolume(){
		return height * super.getArea();
	}
	public static void main(String[] args){
	  Cylinder C = new Cylinder(10.0, "green", 5.0);
	  System.out.println("Radius of cylinder: " + C.getRadius());
	  System.out.println("Volume of Cylinder: " + C.getVolume());
	  }
  }
	

public class Circle extends Shape{
	private double radius;
	public Circle(String color,double radius){
		super(color);
		this.radius=radius;
	}
	public void setRadius(double radius){
		this.radius=radius;
	}
	public double calPerimeter(){
		return 3.14*2*radius;
	}
	public String getType(){
		return "Circle";
	}
}


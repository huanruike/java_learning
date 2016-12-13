public class Triangle extends Shape{
	private double a,b,c;
	public Triangle(String color,double a,double b,double c){
		super(color);
		this.setSides(a,b,c);
	}
	public void setSides(double a,double b,double c){
		if(a>=b+c||b>=a+c||c>=a+b){
			System.out.println("error");
			return;
		}
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public double calPerimeter(){
		return a+b+c;
	}
	public String getType(){
		return "Triangle";
	}
}

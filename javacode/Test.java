public class Test{
	public static void main(String[] args){
		Shape s1=new Triangle("black",3,4,5);
		Shape s2=new Circle("yellow",3);
		System.out.println(s1.getType());
		System.out.println(s1.calPerimeter());
		System.out.println(s2.getType());
		System.out.println(s2.calPerimeter());
	}
}

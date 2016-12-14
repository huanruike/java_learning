import java.util.*;

public class test_2{
	public static void main(String[] args){
		Rectangle rec=new Rectangle(20,30);
		rec.display();
		rec.printArea();
		rec.printPerimeter();
		System.out.println();

		Square squ=new Square(10);
		squ.display();
		squ.printArea();
		squ.printPerimeter();
		System.out.println();
	}
}

abstract class pShape{
	public pShape(double a,double b){
		this.a=a;
		this.b=b;
	}
	public void printPerimeter(){
		System.out.println("C="+(a+b));
	}
	public abstract void printArea();
	public void display(double a,double b){
		System.out.println("a="+a+" b="+b);
	}
	public abstract void display();
	protected double a,b;
}

class Rectangle extends pShape{
	public Rectangle(double a,double b){
		super(a,b);
	}
	public void printArea(){
		System.out.println("rec_S="+a*b);
	}
	public void display(){
		System.out.println("rec_a="+a+" rec_b="+b);
	}

}

class Square extends pShape{
	public Square(double a){
		super(a,a);
	}
	public void printArea(){
		System.out.println("squ_S="+a*a);
	}
	public void display(){
		System.out.println("squ_a="+a);
	}
}

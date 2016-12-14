class A{
	int i;
}

public class test_1{
	public static void main(String[] args){
		A a=new A();
		a.i=0;
		A b=a;
		b.i=100;
		System.out.println("Ai="+a.i);
		System.out.println("Bi="+b.i);
	}
}

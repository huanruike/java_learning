class A{
	String name;
	public A(){
		name="me";
	}
	public String toString(){
		return this.getClass().getName();
	}
}

public class test2{
	public static void main(String[] args) throws Exception{
		A a1=new A();
		System.out.println("before changing:");
		System.out.println("a1.name="+a1.name);
		A a2=a1.getClass().newInstance();
		System.out.println("a2.name="+a2.name);
		a2.name="you";
		System.out.println("after changing:");
		System.out.println("a1.name="+a1.name);
		System.out.println("a2.name="+a2.name);
		Class c1=Class.forName("A");
	}
}

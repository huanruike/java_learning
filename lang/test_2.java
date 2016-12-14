class Child implements Cloneable{
	int age;
	public Child(){
		age=12;
	}
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	public boolean equals(Child o){
		return o.age==age;
	}
}

public class test_2{
	public static void main(String[] args){
		Child c=new Child();
		try{
			Child copy=(Child)c.clone();
			System.out.println("c.equal(copy)="+c.equals(copy));
			copy.age=14;
			System.out.println("after modify copy.age...");
			System.out.println("c.age="+c.age);
			System.out.println("copy.age="+copy.age);
		}
		catch(CloneNotSupportedException e){
			System.out.println("clone failed");
		}
	}
}

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

public class test_1{
	public static void main(String[] args){
		Child c=new Child();
		try{
			Child c2=(Child)c.clone();
			c2.age=14;
			System.out.println(c.age+" "+c2.age);
		}
		catch(CloneNotSupportedException e){
			System.out.println("clone error");
		}
	}
}

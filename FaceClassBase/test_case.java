import java.util.*;

public class test_case{
	public static void main(String[] args){
		Employee OneEmployee=new Employee("ZangSan",25,"SaleStation",5000);
		OneEmployee.display();
	}
}

class Person{
	public Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	public void display(){
		System.out.println("Name: "+name+" age: "+age);
	}
	private String name;
	private int age;
}

class Employee extends Person{
	public Employee(String name,int age,String station,int salary){
		super(name,age);
		this.station=station;
		this.salary=salary;
	}
	public void display(){
		super.display();
		System.out.println("Station:"+station+" salary:"+salary);
	}
	private String station;
	private int salary;
}

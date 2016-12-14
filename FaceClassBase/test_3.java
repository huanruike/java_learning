import java.util.*;

public class test_3{
	public static void main(String[] args){
		Employee zansan=new Employee("张三");
		zansan.setSalary(2000);
		zansan.display();
	}
}

interface ISalary{
	int getSalary();
	void setSalary(int salary);
}

interface IWork{
	void jobEvaluation();
}

class Person{
	public Person(String name){
		this.name=name;
	}
	public void display(){
		System.out.println("姓名："+name);
	}
	private String name;
}

class Employee extends Person implements ISalary,IWork{
	public Employee(String name){
		super(name);
	}
	public int getSalary(){
		return salary;
	}
	public void setSalary(int salary){
		this.salary=salary;
	}
	public void jobEvaluation(){
		System.out.println("在工作中表现很好");
	}
	public void display(){
		super.display();
		System.out.println("工资: "+getSalary());
		this.jobEvaluation();
	}
	private int salary;
}

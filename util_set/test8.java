import java.util.*;

class Person{
	private String name;
	public Person(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
}

class Container<T>{
	private T elem;
	public Container(T elem){
		this.elem=elem;
	}
	public T get(){
		return this.elem;
	}
	public void set(T elem){
		this.elem=elem;
	}
}

public class test8{
	public static void main(String args[]){
		Container<Person> a=new Container<Person>(new Person("Ann"));
		Person b=a.get();
		a.set(new Person("Bill"));
		System.out.println(a.get().getName());
		System.out.println(b.getName());
	}
}

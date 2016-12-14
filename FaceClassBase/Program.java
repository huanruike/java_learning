import java.util.*;

public class Program{
	public static void main(String[] args){
		//以抽象类方式实现多态
		Pet p;
		p=new Cat();
		p.display();
		p=new Dog();
		p.display();
		System.out.println();
		//以接口方式实现多态
		IEat e;
		e=new Cat();
		e.eat();
		e=new Dog();
		e.eat();
		System.out.println();
		//以继承方式实现多态
		Dog d;
		d=new Dog();
		d.shout();
		d=new WangCai();
		d.shout();
		d=new Ahuang();
		d.shout();
		System.out.println();
	}
}

interface IEat{
	void eat();
}

abstract class Pet{
	abstract void display();
}

class Cat extends Pet implements IEat{
	public void eat(){
		System.out.println("猫吃鱼");
	}
	public void display(){
		System.out.println("猫");
	}
}

class Dog extends Pet implements IEat{
	public void eat(){
		System.out.println("狗吃骨头");
	}
	public void display(){
		System.out.println("狗");
	}
	public void shout(){
		System.out.println("汪汪汪");
	}
}

class WangCai extends Dog{
	public void shout(){
		System.out.println("旺财旺财");
	}
}

class Ahuang extends Dog{
	public void shout(){
		System.out.println("阿黄阿黄");
	}
}


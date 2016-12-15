import java.util.*;

public class test5{
	public static void main(String[] args){
		Vector v=new Vector();
		Integer a=new Integer(1);
		v.addElement("one");
		v.addElement(a);
		v.addElement(a);
		v.addElement("two");
		v.addElement(new Integer(2));
		v.addElement(a);
		v.addElement(a);
		System.out.println("vector v is :\t"+v);
		v.insertElementAt("three",2);
		v.insertElementAt(new Float(3.9),3);
		System.out.println("vector v is :\t"+v);
		v.setElementAt("four",2);
		System.out.println("vector v is :\t"+v);
		v.removeElement(1);
		System.out.println("vector v is :\t"+v);
	}
}

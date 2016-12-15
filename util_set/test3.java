import java.util.*;

public class test3{
	public static void main(String[] args){
		Collection<String> coll=new ArrayList<String>();
		coll.add("Ann");
		coll.add("Bill");
		coll.add("Smith");
		coll.add("Tom");
		System.out.print("using Iterator:  ");
		Iterator it=coll.iterator();
		String name;
		while(it.hasNext()){
			name=(String)it.next();
			if(name.equals("Bill")) it.remove();
			else System.out.print(name+" ");
		}
		System.out.println();
	}
}

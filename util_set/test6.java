import java.util.*;

public class test6{
	public static void main(String[] args){
		List lst=new ArrayList();
		lst.add(0,"Ann");
		lst.add(0,"Bill");
		List lst2=new ArrayList();
		lst2.addAll(0,lst);
		lst2.add("Smith");
		for(int i=0;i<lst.size();i++){
			System.out.print((String)lst2.get(i)+" ");
		}
		System.out.println();
		Iterator it=lst2.iterator();
		while(it.hasNext()){
			System.out.print((String)it.next()+" ");
		}
		System.out.println();
	}
}

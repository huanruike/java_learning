import java.util.*;

public class test7{
	public static void main(String[] args){
		List<String> lst=new ArrayList<String>();
		lst.add("Ann");
		lst.add("Bill");
		Iterator it=lst.iterator();
		while(it.hasNext()){
			String s=(String)it.next();
			System.out.print(s+" ");
		}
		System.out.println();
	}
}

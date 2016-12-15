import java.util.*;

public class test4{
	public static void main(String[] args){
		List<Integer> lst=new ArrayList<Integer>();
		for(int i=1;i<=5;i++) lst.add(i);
		lst.set(0,10);
		Iterator it=lst.iterator();
		while(it.hasNext()){
			int x=(int)it.next();
			System.out.print(x+" ");
		}
		System.out.println();
	}
}

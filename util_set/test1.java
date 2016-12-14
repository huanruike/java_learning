import java.util.*;

public class test1{
	public static void main(String[] args){
		Calendar today=Calendar.getInstance();
		System.out.print("today is:"+today.get(Calendar.YEAR)+"year");
		System.out.println(today.get(Calendar.MONTH)+1+"month"+
				today.get(Calendar.DATE)+"day");
		System.out.println(today.get(Calendar.HOUR)+":"+
				today.get(Calendar.MINUTE)+":"+
				today.get(Calendar.SECOND));
	}
}


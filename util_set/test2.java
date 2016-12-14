import java.util.*;

public class test2{
	public static void main(String[] args){
		Random ran1=new Random();
		Random ran2=new Random(1000);
		System.out.println(ran1.nextInt());
		System.out.println(ran1.nextLong());
		System.out.println(ran1.nextFloat());
		System.out.println(ran1.nextDouble());
		System.out.println(ran1.nextGaussian());
		System.out.println("the 2nd set of random numbers:");
		for(int i=0;i<5;i++){
			System.out.println(ran2.nextDouble());
		}
	}
}

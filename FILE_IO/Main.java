import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws Exception{
		BufferedInputStream in=
			new BufferedInputStream(new FileInputStream("in.txt"));
		System.setIn(in);
		PrintStream out=
			new PrintStream(new FileOutputStream("out.txt"));
		System.setOut(out);
		Scanner cin=new Scanner(System.in);
		int a,b;
		while(cin.hasNext()){
			a=cin.nextInt();
			b=cin.nextInt();
			System.out.println(a+b);
		}
	}
}

public class test_6{
	public static void main(String[] args){
		try{
			try{
				int n=Integer.parseInt("0");
				int square=n/n;
				System.out.println("s="+square);
			}
			catch(ArithmeticException ex){
				System.out.println("除0");
			}
			int a=10/0;
		}
		catch(ArithmeticException ex){
			System.out.println("--");
		}
	}
}

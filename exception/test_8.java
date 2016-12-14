class TD{
	public void throwsMethod(int a,int b) throws ArithmeticException{
		int r=a/b;
	}
}

public class test_8{
	public static void main(String[] args){
		TD td=new TD();
		try{
			td.throwsMethod(10,0);
		}
		catch(ArithmeticException ex){
			System.out.println("除0");
			System.out.println(ex.getMessage());
		}
		finally{
			System.out.println("yes");
		}
	}
}

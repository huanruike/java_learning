public class test_4{
	public static void main(String[] args){
		int a=10,b=10;
		try{
			System.out.println(a/b);
		}catch(ArithmeticException ex){
			System.out.println("除0");
		}finally{
			System.out.println("finally!");
		}
	}
}


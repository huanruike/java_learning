public class test_1{
	public static void main(String[] args){
		try{
			int a=10,b=0;
			System.out.println(a/b);
		}catch(ArithmeticException ex){
			System.out.println("算术异常");
		}
	}
}

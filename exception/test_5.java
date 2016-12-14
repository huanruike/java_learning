public class test_5{
	public static void main(String[] args){
		int a=Integer.parseInt("2");
		int b=Integer.parseInt("0");
		try{
			System.out.println(a/b);
		}catch(ArrayIndexOutOfBoundsException ex){
			System.out.println("Array");
		}catch(NumberFormatException ex){
			System.out.println("Format");
		}catch(ArithmeticException ex){
			System.out.println("除0");
		}finally{
			System.out.println("yes");
		}
	}
}

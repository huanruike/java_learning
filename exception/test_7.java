public class test_7{
	static void get(int a,int b){
		try{
			if(b==0){
				//throw new ArithmeticException("除0");
			}
			System.out.println(a/b);
		}
		catch(ArithmeticException ex){
			System.out.println(ex.getMessage());
		}
	}
	public static void main(String[] args){
		get(10,0);
	}
}

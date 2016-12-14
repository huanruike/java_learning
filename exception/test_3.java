public class test_3{
	public static void main(String[] args){
		String s="abc";
		try{
			int a=Integer.parseInt(s);
			System.out.println(a);
		}catch(NumberFormatException ex){
			System.out.println("数字格式异常");
		}
	}
}

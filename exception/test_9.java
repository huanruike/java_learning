class MyException extends Exception{
	MyException(){
		super("我自定义的异常");
	}
}

public class test_9{
	public static void main(String[] args){
		int a=10,b=1;
		try{
			if(b==0||b==1) throw new MyException();
			System.out.println(a/b);
		}
		catch(MyException ex){
			System.out.println(ex.getMessage());
		}
	}
}

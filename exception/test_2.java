public class test_2{
	public static void main(String[] args){
		int[] ary={10,20,30,40,50};
		try{
			for(int i=0;i<6;i++) System.out.println(ary[i]+'\t');
			System.out.println();
		}catch(ArrayIndexOutOfBoundsException ex){
			System.out.println("数组下标越界");
		}
	}
}

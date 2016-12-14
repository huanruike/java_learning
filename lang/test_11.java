class SB implements Cloneable{
	int x;
	public SB(int x){
		this.x=x;
	}
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}

public class test_11{
	public static void main(String[] args){
		try{
			SB sb=new SB(10);
			SB sb2=(SB)sb.clone();
			sb2.x=20;
			System.out.println(sb.x+" "+sb2.x);
		}
		catch(CloneNotSupportedException ex){
			System.out.println("clone error");
		}
	}
}

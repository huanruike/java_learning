public class test5{
	public static void main(String[] args){
		String s="100*2+160/(78+2)";
		int cnt=0;
		for(int i=0;i<s.length();i++){
			if('0'<=s.charAt(i)&&s.charAt(i)<='9') cnt++;
		}
		System.out.println(cnt);
	}
}

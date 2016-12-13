public class BetterPrinter implements Output{
	private String[] printData=new String[MAX_CACHE_LINE*2];
	private int dataNum=0;
	public void out(){
		while(dataNum>0){
			System.out.println("高速打印机正在打印: "+printData[0]);
			System.arraycopy(printData,1,printData,0,--dataNum);
		}
	}
	public void getData(String msg){
		if(dataNum>=MAX_CACHE_LINE*2) System.out.println("添加失败");
		else printData[dataNum++]=msg;
	}
}

class NewThread implements Runnable{
	public void run(){
		for(int i=10;i>=1;i--){
			try{
				System.out.println("left time: "+i);
			}
			catch(InterruptedException e){
				System.out.println(e.getMessage());
			}
		}
		System.out.println("game is over,bye!");
	}
}

public class test3{
	public static void main(String[] args){
		NewThread th=new NewThread();
		Thread thd=new Thread(th,"thd");
		thd.start();
	}
}

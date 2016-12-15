class NewThread extends Thread{
	NewThread(String name){
		super(name);
	}
	public void run(){
		for(int i=10;i>=1;i--){
			try{
				System.out.println("left time: "+i);
				Thread.sleep(1000);
			}catch(InterruptedException e){
				System.out.println(e.getMessage());
			}
		}
		System.out.println("game is over,bye!");
	}
}

public class test2{
	public static void main(String[] args){
		NewThread th=new NewThread("th");
		th.start();
	}
}

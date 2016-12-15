class NewThread extends Thread{
	NewThread(){
		super("Thread_Demo");
		System.out.println("New thread: "+getName());
	}
	public void run(){
		for(int i=1;i<=20;i++){
			System.out.println(Thread.currentThread().getName()+" running");
		}
	}
}

public class test1{
	public static void main(String[] args){
		NewThread newThr=new NewThread();
		newThr.start();
	}
}

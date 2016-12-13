public class OutputFactory{
	public Output getOutput(){
		//return new Printer();
		return new BetterPrinter();
	}
	public static void main(String[] args){
		OutputFactory of=new OutputFactory();
		Computer c=new Computer(of.getOutput());
		c.keyIn("I am sb");
		c.keyIn("but I am learning");
		c.print();
	}
}


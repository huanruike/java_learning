interface interfaceA{
	/**
	  省略接口前的修饰符(public):表示在相同的包(package)内才能访问(default)
		如果用public修饰: 在不同的包之间也能访问
	*/
	int PROP_A=5;
	void testA();
}

interface interfaceB{
	int PROP_B=6;
	void testB();
}

interface interfaceC extends interfaceA, interfaceB{
	int PROP_C=7;
	void testC();
}

public class InterfaceExtendsTest{
	public static void main(String[] args){
		System.out.println(interfaceC.PROP_A);
		System.out.println(interfaceC.PROP_B);
		System.out.println(interfaceC.PROP_C);
	}
}

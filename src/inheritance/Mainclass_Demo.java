package inheritance;

class Demo{
	int val=100;
	void test() {
		System.out.println("Executing test().....");
	}
}

class Sample extends Demo{ //"Extends" is the 
	//keyword used to inherite the property of Demo 
	//class to sample class	
}

public class Mainclass_Demo {
	public static void main(String[] args) {
		Sample ref=new Sample();
		System.out.println(ref.val);
		ref.test();
	}
}

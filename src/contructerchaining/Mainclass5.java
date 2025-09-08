package contructerchaining;

class Demo{
	Demo(){
		System.out.println("Demo() Constructor");
	}
}
class Sample extends Demo{
	Sample(){
		super();
		System.out.println("Sample() Constructor");
	}
}

public class Mainclass5 {
	public static void main(String[] args) {
		Sample ref=new Sample();
	}
}

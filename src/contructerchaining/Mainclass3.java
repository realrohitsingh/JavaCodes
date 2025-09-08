package contructerchaining;

class Amazon{
	Amazon(){
		System.out.println("Initialize Shopping");
	}
	Amazon(double subscription){
		this();
		System.out.println("Initialize Video");
		System.out.println("Initialize Music");
	}
}

public class Mainclass3 {
	public static void main(String[] args) {
		Amazon a1=new Amazon();
		System.out.println("=============");
		Amazon a2=new Amazon(1.5);
	}
}

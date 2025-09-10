package downcasting;

class Demo{
	
}
class Sample extends Demo{
	
}

public class Mainclass1 {
	public static void main(String[] args) {
		Demo ref=new Sample();
		Sample obj=(Sample)ref; //Downcasting : Demo-->Sample
		System.out.println(ref);
		System.out.println(obj);
	}
}

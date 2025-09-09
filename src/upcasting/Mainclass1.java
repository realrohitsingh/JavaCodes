package upcasting;

class Demo{
	
}

class Sample extends Demo{
	
}

public class Mainclass1 {
	public static void main(String[] args) {
		Sample ref=new Sample();
		Demo obj=ref; // Upcasting : Sample---->Demo
		System.out.println(ref);
		System.out.println(obj);
	}
}

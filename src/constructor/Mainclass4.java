package constructor;

class Example{
	int x;
	double y;
	char z;
	Example(){
		x=18;
		y=1.8;
		z='V';
	}
}

public class Mainclass4 {
	public static void main(String[] args) {
		Example ex=new Example();
		System.out.println(ex.x);
		System.out.println(ex.y);
		System.out.println(ex.z);
		
	}
}

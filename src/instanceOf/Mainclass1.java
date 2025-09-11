package instanceOf;

class Parent{
	
}
class Son extends Parent{
	
}
class Daughter extends Parent {
	
}

public class Mainclass1 {
	public static void main(String[] args) {
		Parent ref=new Daughter();
		if(ref instanceof Son) {
			System.out.println("Rough and Tough");
		}
		else if(ref instanceof Daughter) {
			System.out.println("Papa Ki Pari");
		}
		else {
			System.out.println("No Child");
		}
	}
}

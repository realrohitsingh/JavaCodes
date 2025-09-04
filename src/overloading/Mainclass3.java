package overloading;

class SoftwareEngineer{
	SoftwareEngineer(int a, String s){
		System.out.println("Developer");
	}
	SoftwareEngineer(String s,int a){
		System.out.println("Test Engineer");
	}
}

public class Mainclass3 {

	public static void main(String[] args) {
		SoftwareEngineer sw1=new SoftwareEngineer(10,"abc");
		SoftwareEngineer sw2=new SoftwareEngineer("abc",10);

	}

}

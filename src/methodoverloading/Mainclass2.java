package methodoverloading;
// Length of Arguments
class Sample{
	void test(int a) {
		System.out.println("White Box Testing");
	}
	void test(int a,int b) {
		System.out.println("Black Box Testing");
	}
	void test(int a,int b,int c) {
		System.out.println("Grey Box Testing");
	}
}

public class Mainclass2 {
	public static void main(String[] args) {
		Sample ref=new Sample();
		ref.test(10);
		ref.test(10,10);
		ref.test(10,10,10);
	}
}

package recursion;

public class Example1 {
	static void display(int a) {
		System.out.println(a);
		if(1<a) {
			a--;
			display(a);
		}
	}
	public static void main(String[] args) {
		display(5);
	}
}
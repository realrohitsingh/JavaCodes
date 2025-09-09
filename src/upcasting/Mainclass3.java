package upcasting;

class Delta{
	int num=100;
}
class Example extends Delta{
	int val=200;
}
public class Mainclass3 {
	public static void main(String[] args) {
		Delta d=new Example(); //upcasting : Example---->Delta
		System.out.println(d.num);
	}
}

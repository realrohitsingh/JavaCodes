package upcasting;

class Alpha{
	void play() {
		System.out.println("Executing play ().....");
	}
}
class Beta extends Alpha{
	void send() {
		System.out.println("Executing send ()......");
	}
}

public class Mainclass2 {
	public static void main(String[] args) {
		Beta ref=new Beta();
		ref.play();
		ref.send();
		Alpha obj=ref;//Upcasting : beta----->alpha
		obj.play();
//		obj.send(); CTE : after upcasting we cannot access sub class properties.
	}
}

package inheritance;

class Alpha {
	void play() {
		System.out.println("Executing play()...");
	}
}

class Beta extends Alpha {
	void help() {
		System.out.println("Executing help().....");
	}
}

public class Mainclass2 {
	public static void main(String[] args) {
		Alpha ref = new Alpha();
		ref.play();
		System.out.println("---------");
		Beta obj = new Beta();
		obj.help();
		obj.play();
	}
}

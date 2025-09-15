package methodoverriding;

class Windows10 {
	void start() {
		System.out.println("List View");
	}
}

class Windows11 extends Windows10 {
	@Override
	void start() {
		System.out.println("Box View");
	}
}
class Windows8 extends Windows11{
	@Override
	void start() {
		System.out.println("Tiles View");
	}
}

public class Mainclass7 {
	public static void main(String[] args) {
		Windows10 ref=new Windows8();
		ref.start();
	}
}

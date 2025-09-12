package methodoverloading;

class Irctc{
	void search(int a) {
		System.out.println("Search with Train Number");
	}
	void search(long l) {
		System.out.println("Search with PNR Number");
	}
	void search(String src,String dest) {
		System.out.println("Search with Source Destination");
	}
}

public class Mainclass6 {
	public static void main(String[] args) {
		Irctc ref=new Irctc();
		ref.search(12802);
		ref.search(1280212345);
		ref.search("BLR","JSR");
	}
}

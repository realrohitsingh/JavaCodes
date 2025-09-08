package inheritance;

class AdobeFree {
	void read() {
		System.out.println("Read Only");
	}
}

class AdobePaid extends AdobeFree{
	void edit() {
		System.out.println("Edit also");
	}
}

public class CodeReuablity3 {
	public static void main(String[] args) {
		AdobePaid a1=new AdobePaid();
		a1.edit();
		a1.read();
	}
}

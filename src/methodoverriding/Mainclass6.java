package methodoverriding;

class AntiVirusFree {
	void scan() {
		System.out.println("Malware");
	}
}

class AntiVirusPaid extends AntiVirusFree {
	@Override
	void scan() {
		System.out.println("Malware + Spyware");
	}
}

public class Mainclass6 {
	public static void main(String[] args) {
		AntiVirusFree ref = new AntiVirusPaid();
		ref.scan();
	}
}

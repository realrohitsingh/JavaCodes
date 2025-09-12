package methodoverloading;

class FingerPrint {

}

class Mobile {
	void unlock() {
		System.out.println("Swipe to Unlock");
	}

	void unlock(int a) {
		System.out.println("Enter Passcode to Unlock");
	}

	void unlock(String s) {
		System.out.println("Enter Password to Unlock");
	}

	void unlock(FingerPrint obj) {
		System.out.println("Fingerprint to Unlock");
	}
}

public class Mainclass7 {
	public static void main(String[] args) {
		Mobile mob = new Mobile();
		mob.unlock();
		mob.unlock(10);
		mob.unlock("Rohit123");
		mob.unlock(new FingerPrint());
	}
}

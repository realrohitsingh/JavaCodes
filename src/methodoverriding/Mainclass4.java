package methodoverriding;

class FacebookOld {
	void reaction() {
		System.out.println("Like");
	}
}

class FacebookNew extends FacebookOld {
	@Override
	void reaction() {
		System.out.println("Like,wow,haha,sad,love,angry");
	}
}

public class Mainclass4 {
	public static void main(String[] args) {
		FacebookOld ref = new FacebookNew();
		ref.reaction();
	}
}

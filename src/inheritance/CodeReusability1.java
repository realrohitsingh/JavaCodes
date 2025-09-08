package inheritance;

class InstagramOld{
	void post() {
		System.out.println("Posting Photo");
	}
}

class InstagramNew extends InstagramOld{
	void messenger() {
		System.out.println("Messaging Service");
	}
}

public class CodeReusability1 {
	public static void main(String[] args) {
		InstagramNew ref=new InstagramNew();
		ref.post();
		ref.messenger();
	}
}

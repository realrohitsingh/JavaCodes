package runtimepolymorphism;

public class DisplayAdapter {
	static void adapt(Facebook fb) {
		if(fb!=null) {
			fb.display();
		}
	}
}

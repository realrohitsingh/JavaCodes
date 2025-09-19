package runtimepolymorphism;

public class Mainclass3 {
	public static void main(String[] args) {
		FacebookMobile mob=new FacebookMobile();
		DisplayAdapter.adapt(mob);
		System.out.println("----------------");
		FacebookWebsite web=new FacebookWebsite();
		DisplayAdapter.adapt(web);
	}
}

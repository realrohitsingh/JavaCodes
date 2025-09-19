package runtimepolymorphism;

public class Mainclass1 {
	public static void main(String[] args) {
		FrontEnd fe=new FrontEnd();
		Lead.reviewWork(fe);
		System.out.println("-----------------");
		BackEnd be=new BackEnd();
		Lead.reviewWork(be);
	}
}

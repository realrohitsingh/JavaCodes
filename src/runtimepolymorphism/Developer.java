package runtimepolymorphism;

class Developer {
	void work() {
		System.out.println("Coding");
	}
}
class FrontEnd extends Developer{
	@Override
	void work() {
		System.out.println("HTML,CSS,JavaScript");
	}
}
class BackEnd extends Developer{
	@Override
	void work() {
		System.out.println("Java,Spring,SQL");
	}
}
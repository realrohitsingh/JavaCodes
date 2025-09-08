package contructerchaining;

class Student{
	Student(){
		System.out.println("Initialize Personal Details");
		System.out.println("Initialize Academic Details");
	}
	Student(boolean exp){
		this();
		System.out.println("Initalize Experience Details");
	}
}

public class Mainclass4 {
	public static void main(String[] args) {
		Student s1=new Student();
		System.out.println("-----------------");
		Student s2=new Student(true);
	}
}

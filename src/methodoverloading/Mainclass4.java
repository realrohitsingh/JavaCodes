package methodoverloading;

class Facebook{
	void login(String user,String pwd) {
		System.out.println("Login with Username and Password");
	}
	void login(long num,String pwd) {
		System.out.println("Login with PhoneNumber and Password");
	}
}

public class Mainclass4 {
	public static void main(String[] args) {
		Facebook fb=new Facebook();
		fb.login("Rohit","Rohit@123");
		fb.login(9876543210L,"Rohit@123");
	}
}

package hasarelationship;

class Account {
	void withdraw() {
		System.out.println("Money has gone");
	}

	void deposit() {
		System.out.println("Money has come");
	}
}

class Customer {
	Account a = new Account();
}

class Bank {
	Customer cu;

	Bank(Customer cu) {
		this.cu = cu;
	}
}

public class Mainclass6 {
	public static void main(String[] args) {
		Customer cu = new Customer();
		Bank icici = new Bank(cu);
		icici.cu.a.withdraw();

		Bank sbi = new Bank(cu);
		sbi.cu.a.deposit();
	}
}

package upcasting.RealTimeExample;

public class Mainclass2 {
	public static void main(String[] args) {
		Biriyani b1=new Biriyani();
		Swiggy.orderFood(b1);
		
		DeathByChocolate d=new DeathByChocolate();
		Swiggy.orderFood(d);
		
		Burger b=new Burger();
		Swiggy.orderFood(b);
	}
}

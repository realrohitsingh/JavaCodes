package upcasting.RealTimeExample;

public class Mainclass1 {
	public static void main(String[] args) {
		Red r=new Red();
		ColorPalette.selectColor(r);
		
		Blue b=new Blue();
		ColorPalette.selectColor(b);

		Green g=new Green();
		ColorPalette.selectColor(g);
		
		Black bl=new Black();
		ColorPalette.selectColor(bl);
	}
}

package arrayojava;

public class Program13 {
	public static void main(String[] args) {
        double[] dArr = {6.0, 5.6, 5.7, 5.8, 5.9, 6.0};
        double sumFirstLast = 0;
        double sumRem = 0;
        for (int i = 0; i < dArr.length; i++) {
            if (i == 0 || i == dArr.length - 1) {
                sumFirstLast = sumFirstLast + dArr[i];
            } else {
                sumRem = sumRem + dArr[i];
            }
        }
        System.out.println("Sum of 1st & last: " + sumFirstLast);
        System.out.println("Sum of remaining: " + sumRem);
    }
}
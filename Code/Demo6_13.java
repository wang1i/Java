package myjava;

public class Demo6_13 {

	public static void main(String[] args) {
		System.out.println("i               m(i)");
		for (double i = 1; i <= 20; i++) {
			System.out.printf("%-15.0f%-10.4f", i, series(i));
			System.out.println();
		}

	}

	public static double series(double i) {
		double result = 0;
		for (double j = 1; j <= i; j++) {
			result += j / (j + 1);
		}
		return result;
	}

}

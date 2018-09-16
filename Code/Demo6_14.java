package myjava;

public class Demo6_14 {

	public static void main(String[] args) {
		System.out.println("i               m(i)");
		for (double i = 1; i <= 901; i += 100) {
			System.out.printf("%-15.0f%-10.4f", i, series(i));
			System.out.println();
		}

	}

	public static double series(double i) {
		double term, sign = -1, result = 0, deno = 1;
		while (deno <= 2 * i - 1) {
			sign *= -1;
			term = sign / deno;
			result += term;
			deno += 2;
		}
		return 4 * result;
	}

}

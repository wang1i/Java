package myjava;

public class Demo6_8 {

	public static void main(String[] args) {
		double i, j;
		System.out.println("摄氏度          华氏度                    华氏度          摄氏度");
		for (i = 40, j = 120; i >= 31 && j >= 30; i -= 1, j -= 10) {
			System.out.print((int) (i * 10) / 10.0 + "            " + (int) (celsiusToFahrenheit(i) * 100) / 100.0);
			if (i > 37)
				System.out.println("                       " + (int) (j * 10) / 10.0 + "           "
						+ (int) (fahrenheitToCelsius(j) * 100) / 100.0);
			else
				System.out.println("                         " + (int) (j * 10) / 10.0 + "             "
						+ (int) (fahrenheitToCelsius(j) * 100) / 100.0);

		}

	}

	public static double celsiusToFahrenheit(double i) {
		return (9.0 / 5) * i + 32;
	}

	public static double fahrenheitToCelsius(double j) {
		return (5.0 / 9) * (j - 32);
	}
}

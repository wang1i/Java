package myjava;

public class Demo6_16 {

	public static void main(String[] args) {
		System.out.println("年份          天数");
		for (int year = 2000; year <= 2020; year++) {
			System.out.printf("%-13d%-10d", year, numberOfDaysInAYear(year));
			System.out.println();
		}

	}

	public static int numberOfDaysInAYear(int year) {
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
			return 366;
		else
			return 365;
	}

}

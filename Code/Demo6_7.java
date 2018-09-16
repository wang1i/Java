package myjava;

import java.util.Scanner;

public class Demo6_7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入投资额：");
		double amount = input.nextDouble();
		System.out.print("请输入年利率(以9代表9%：");
		double yearRate = input.nextDouble();
		double monthlyRate = yearRate / 1200;
		System.out.println("年份     " + "未来投资额  ");
		for (int i = 1; i <= 30; i++) {
			System.out.printf("%-8d", i);
			System.out.println(futureInvestmentValue(amount, monthlyRate, i));
		}

	}

	public static double futureInvestmentValue(double amount, double monthlyRate, int i) {

		return amount * Math.pow(1 + monthlyRate, i * 12);
	}

}

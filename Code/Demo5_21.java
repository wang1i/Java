package myjava;

import java.util.Scanner;

public class Demo5_21 {

	public static void main(String[] args) {
		int j;
		Scanner input = new Scanner(System.in);
		System.out.print("请输入贷款总额：");
		double amount = input.nextDouble();
		System.out.print("请输入年数：");
		int year = input.nextInt();
		double monthlyPay , totalPay , monthlyRate;
		System.out.println("利率          月支付额          总支付额");
		for(double i = 5.000 ; i <= 8.000 ; i  += 0.125) {
			System.out.print(i + "%          ");
			monthlyRate = i / 1200;
			monthlyPay = (amount * monthlyRate)  / Math.abs(1 - 1/Math.pow(1 + monthlyRate, year * 12));
			totalPay = monthlyPay * 60;
			System.out.println(monthlyPay + "             " + totalPay);
		}

	}

}

package myjava;

import java.util.Scanner;

public class Demo5_22 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入贷款额：");
		double amount = input.nextDouble();
		System.out.print("请输入贷款年数：");
		int year = input.nextInt();
		System.out.print("请输入年利率（如以3表示3%）：");
		double yearRate = input.nextDouble();
		System.out.println();
		double interest, principal;
		double balance = amount;
		
		double monthlyRate = yearRate / 1200;
		double monthlyPay = (amount * monthlyRate) / (1 - 1 / Math.pow(1 + monthlyRate, year * 12));
		double totalPay = monthlyPay * year * 12;
		System.out.println("月支付额：" + (int)(monthlyPay * 100) / 100.0);
		System.out.println("总支付额：" + (int)(totalPay * 100) / 100.0 + "\n");
		
		System.out.println("月份          利息            本金               余额");
		for(int i = 1 ; i <= year * 12 ; i ++) {
			interest = balance * monthlyRate ;
			principal =monthlyPay - interest;
			balance -= principal;
			System.out.printf("%-5d%15.2f%17.2f%18.2f", i , interest , principal , balance);
			System.out.println();
		}
		

	}

}

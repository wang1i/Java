package myjava;

import java.util.Scanner;

public class Demo2_20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入收支余额和年利率（输入3即代表3%）：");
		double balance = input.nextDouble();
		double yearRate = input.nextDouble();
		
		double interst = balance * (yearRate / 1200);
		
		System.out.println("利息额为：" + interst);

	}

}

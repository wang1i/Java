package myjava;

import java.util.Scanner;

public class Demo5_30 {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.print("请输入月存储量：");
		double monthAmount = input.nextDouble();
		System.out.print("请输入年利率（以5即代表5%）：");
		double yearRate = input.nextDouble();
		System.out.print("请输入存储月数：");
		int months = input.nextInt();
		double amount = 0;
		double monthRate = yearRate / 1200;
		
		for(int i = 1 ; i <= months ; i ++) {
			amount = (monthAmount + amount) * (1 + monthRate);
		}
		System.out.println("账户余额：" + amount);

	}

}

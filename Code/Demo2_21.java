package myjava;

import java.util.Scanner;

public class Demo2_21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入投资金额：");
		double investment = input.nextDouble();
		System.out.println();
		System.out.print("请输入年利率（输入3即代表3%）：");
		double yearRate = input.nextDouble();
		System.out.println();
		System.out.print("请输入年数：");
		double year = input.nextDouble();
		
		double futureValue = investment * Math.pow(1+yearRate/1200, year *12);
		
		System.out.println("未来投资金额为：" + futureValue);
		

	}

}

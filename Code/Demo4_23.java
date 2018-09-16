package myjava;

import java.util.Scanner;

public class Demo4_23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入雇员姓名：");
		String name = input.nextLine();
		System.out.print("请输入每周工作的小时数：");
		double time = input.nextDouble();
		System.out.print("请输入每小时酬金$：");
		double payRate = input.nextDouble();
		System.out.print("请输入联邦所得税税率：");
		double federalRate = input.nextDouble();
		System.out.print("请输入州所得税税率：");
		double stateRate = input.nextDouble();
		
		double grossPay = payRate * time ;
		double federalDeduction = federalRate * grossPay;
		double stateDeduction = stateRate * grossPay;
		double totalDeduction = federalDeduction + stateDeduction;
		double netPay = grossPay - totalDeduction;
		
		System.out.println("雇员姓名：" + name + "\n" + "每周工作小时数：" + time );
		System.out.println("每小时酬金：" + "$" + payRate + "\n" + "总报酬：" + grossPay );
		System.out.println("折耗：" + "\n" + "  联邦税（20%）：$" + federalDeduction + "\n" +  "  州税（9.0%）：$" + stateDeduction);
		System.out.println( "  总税：$" + totalDeduction + "\n" + "净酬金：$" + netPay);

	}

}

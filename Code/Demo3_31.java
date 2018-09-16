package myjava;

import java.util.Scanner;

public class Demo3_31 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入美元到人民币的汇率：");
		double rate = input.nextDouble();
		System.out.println("请选择由美元兑换人民币（输入0）或由人民币兑换美元（输入1）：");
		int choice = input.nextInt();
		if(choice !=0 && choice !=1) {
			System.out.println("选项输入错误，只能为0或1！");
			System.exit(1);
		}
		System.out.print("请输入美元/人民币金额：");
		double amount = input.nextDouble();
		
		if(choice == 0) 
			System.out.println(amount + "美元可兑换" + (amount * rate) + "人民币");
		if(choice == 1)
			System.out.println(amount + "人民币可兑换" + (amount / rate) + "美元");
		

	}

}

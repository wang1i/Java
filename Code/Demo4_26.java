package myjava;

import java.util.Scanner;

public class Demo4_26 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入金额：");
		String amount = input.nextLine();
		int sign = amount.indexOf('.');
		String dollars = amount.substring(0, sign);
		String pennies = amount.substring(sign+1);
		System.out.println(dollars + "美元" + pennies + "美分");

	}

}

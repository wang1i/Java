package myjava;

import java.util.Scanner;

public class Demo3_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1 = (int)(Math.random() * 10);
		int num2 = (int)(Math.random() * 10);
		int num3 = (int)(Math.random() * 10);
		System.out.print("请输入" + num1 + "+" + num2 + "+" +num3+ "=?：");
		int answer = input.nextInt();
		if(answer == num1 + num2 + num3) {
			System.out.print("祝贺你！回答正确！");		
		}
		else {
			System.out.print("抱歉！回答错误！正确答案为" + (num1 + num2 + num3));
		}
	}

}

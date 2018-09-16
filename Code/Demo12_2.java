package myjava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo12_2 {

	public static void main(String[] args) {
		System.out.print("请输入两个整数：");
		int num1 = 0, num2 = 0;
		try {
			try (Scanner input = new Scanner(System.in);) {
				num1 = input.nextInt();
				num2 = input.nextInt();
			}
			System.out.println("和：" + (num1 + num2));
		} catch (InputMismatchException ex) {
			System.out.println("输入有误，请重新输入");
		}
	}

}
